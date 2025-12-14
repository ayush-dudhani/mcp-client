# mcp-client

A small Spring Boot client that interacts with an MCP server and optional local model services.

## Overview

This project initializes an MCP client and can forward requests to local model endpoints. Configure the connection and model settings via environment variables or Spring `application.properties`.

## Prerequisites

- Java 17+ (or the version required by the project)
- Maven
- (Optional) Running MCP server exposing the `/sse` endpoint if the MCP client is enabled

## Configuration

Set required environment variables or add them to `src/main/resources/application.properties`. Example environment variables (customize per environment):

```bash
# Example environment variables (customize values)
MCP_SSE_BASE_URL=http://localhost:8080
OLLAMA_BASE_URL=http://localhost:11434
OLLAMA_CHAT_MODEL=llama3.2:1b
