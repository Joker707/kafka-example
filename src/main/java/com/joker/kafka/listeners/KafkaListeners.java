package com.joker.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
        topics = "joker",
        groupId = "joker's group"
    )
    void listener(String data) {
        System.out.println("Listener recieved: " + data);
    }
}
