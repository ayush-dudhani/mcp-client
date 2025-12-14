package org.keepcalm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McpClient {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SpringApplication.run(McpClient.class, args);
    }
}