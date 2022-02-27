package me.toy.system.kafka.controller;

import lombok.AllArgsConstructor;
import me.toy.system.kafka.service.KafkaSampleProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class KafkaSampleProducerController {

    private final KafkaSampleProducerService kafkaSampleProducerService;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(String message) {
        kafkaSampleProducerService.sendMessage(message);
    }

}
