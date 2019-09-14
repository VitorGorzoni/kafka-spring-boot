package com.br.kafka.demo.message.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MessageRepositoryConsumer {

    private final Logger logger = LoggerFactory.getLogger(MessageRepositoryConsumer.class);

    @KafkaListener(topics = "messages", groupId = "group_message")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
