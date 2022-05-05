package com.nazarov.kafkalearning;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "mytopic",
            groupId = "groupID"
    )
    void listener(String data) {
        System.out.println("LISTENER RECIEVED:----> " + data + " <----");
    }
}
