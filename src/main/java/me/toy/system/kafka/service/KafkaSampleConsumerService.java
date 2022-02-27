package me.toy.system.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaSampleConsumerService {

    @KafkaListener(topics = "test_topic", groupId = "group-id-system-toy")
    public void consume(String message) throws IOException {
        System.out.println("kafka consumer receive: " + message);
    }

}
