package com.example.springbootkafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@RestController
@RequestMapping("/producer")
public class ProducerController {
    private final String TOPIC_NAME = "repTopic";

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/send")
    public String sendMsg(){
        kafkaTemplate.send(TOPIC_NAME,1,"mykey","this is message");
        return "sendScusess!";
    }

}
