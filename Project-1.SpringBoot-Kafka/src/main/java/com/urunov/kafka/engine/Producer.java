package com.urunov.kafka.engine;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Producer {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        logger.info(String.format("#### -> Producing message -> %s", message ));
        this.kafkaTemplate.send(TOPIC, message);
    }

}
