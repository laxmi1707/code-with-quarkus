package org.acme.controller;


import java.nio.charset.StandardCharsets;
import org.acme.domain.*;
import org.acme.repository.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class RabbitMQConsumer {

    @Inject
    MessageRepository repository;

    @Incoming("demo-queue")
    public void consume(byte[] messageBytes) {
        String messageContent = new String(messageBytes, StandardCharsets.UTF_8);

         // Create a new Message entity
        Message message = new Message();
        message.setContent(messageContent);
        repository.save(message.getContent());
        System.out.println("Consumed and saved: " + message.getContent());
    }
}