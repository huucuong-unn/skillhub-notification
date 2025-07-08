package com.skillhub.notification.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationListener {

    @KafkaListener(topics = "skillhub.notification", groupId = "skillhub-notification-group")
    public void listen(ConsumerRecord<String, String> record) {
        log.info("Received message: Key = {}, Value = {}", record.key(), record.value());
    }
}
