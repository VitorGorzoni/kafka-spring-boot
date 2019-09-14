package com.br.kafka.demo.message.view;

import com.br.kafka.demo.message.application.MessageApplication;
import com.br.kafka.demo.message.application.MessageFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageView {

    @Autowired
    private MessageFacade application;

    @PostMapping("/message")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMessage(@RequestParam("message") String message) {
        application.createMessage(message);
    }
}
