package com.br.kafka.demo.message.domain.model;

public interface MessageRepository {
    void createMessage(String message);
}
