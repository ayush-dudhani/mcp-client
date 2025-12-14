package org.keepcalm.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private final ChatClient chatClient;

    public BasicController(ChatClient.Builder chatClientBuilder, ToolCallbackProvider toolCallbackProvider) {
        this.chatClient = chatClientBuilder
                .defaultSystem("Give precise to the point answer")
                .defaultToolCallbacks(toolCallbackProvider)
                .build();
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String query) {
        PromptTemplate promptTemplate = new PromptTemplate(query);
        Prompt prompt = promptTemplate.create();
        ChatClient.CallResponseSpec res = chatClient.prompt(prompt).call();
        return res.content();
    }
}
