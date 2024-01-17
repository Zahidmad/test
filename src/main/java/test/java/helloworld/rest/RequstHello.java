package test.java.helloworld.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("kafka")
public class KafkaController {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/test")
    public String helloWorld() {
        kafkaTemplate.send("test", "salam. topic-e gonderdim");
        return "Hello World!";
    }
}
