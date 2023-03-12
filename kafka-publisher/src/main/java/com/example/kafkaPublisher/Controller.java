package com.example.kafkaPublisher;

import com.example.kafkaPublisher.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private KafkaTemplate<String, Object> template;
    private String topic="bitcoin";
    @GetMapping("/kafka/testing/{name}")
    public String publishMessage(@PathVariable String name ){
        template.send(topic,"hii "+name+ " how are you!");
        return "data published";
    }
    @GetMapping("/publishJson")
    public  String publishMessage(){
        User user = new User(2532, "User88", new String[] { "Bangalore", "BTM", "house 90" });
        template.send(topic, user);
        return "Json Data published";
    }
}
