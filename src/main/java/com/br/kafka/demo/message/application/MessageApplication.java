package com.br.kafka.demo.message.application;

import com.br.kafka.demo.message.domain.model.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageApplication implements MessageFacade {

    @Autowired
    private MessageRepository repository;

    @Override
    public void createMessage(String message) {
        repository.createMessage(message);
    }
}
