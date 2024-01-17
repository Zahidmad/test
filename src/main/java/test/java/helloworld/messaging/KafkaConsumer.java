package test.java.helloworld.messaging;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "group")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group: " + message);
    }
}
