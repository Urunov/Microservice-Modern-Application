package com.urunov.kafka.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.io.IOException;

public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
