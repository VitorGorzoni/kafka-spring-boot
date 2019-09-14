package com.br.kafka.demo.message.infrastructure;

import com.br.kafka.demo.message.domain.model.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepositoryImpl implements MessageRepository {

    private static final Logger logger = LoggerFactory.getLogger(MessageRepository.class);
    private static final String topic = "messages";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void createMessage(String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(topic, message);
    }
}
