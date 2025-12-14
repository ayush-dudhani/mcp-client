//package org.keepcalm.service;
//
//import org.springframework.ai.chat.messages.UserMessage;
//import org.springframework.ai.chat.model.ChatResponse;
//import org.springframework.ai.chat.prompt.Prompt;
//import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LlamaService {
//
//    private final VertexAiGeminiChatModel chatModel;
//
//    // The model is auto-configured and injected here
//    public LlamaService(VertexAiGeminiChatModel chatModel) {
//        this.chatModel = chatModel;
//    }
//
//    public String generateResponse(String userPrompt) {
//        UserMessage userMessage = new UserMessage(userPrompt);
//        Prompt prompt = new Prompt(userMessage);
//
//        // Call the model and get the response
//        ChatResponse response = chatModel.call(prompt);
//
//        // Extract the generated content
//        return response.getResult().getOutput().get;
//    }
//}
