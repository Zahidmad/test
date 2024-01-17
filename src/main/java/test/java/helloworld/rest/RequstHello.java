package test.java.helloworld.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/")
public class RequstHello {
    @RequestMapping ("/")
    public String home() {return "Hello World 2 !" ;}
    public static void main(String[] args) {
        SpringApplication.run(RequstHello.class, args);
    }

    }
