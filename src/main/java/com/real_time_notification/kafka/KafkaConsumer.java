package com.real_time_notification.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "topic_name", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}

