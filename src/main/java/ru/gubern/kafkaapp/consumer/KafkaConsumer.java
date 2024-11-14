package ru.gubern.kafkaapp.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.gubern.kafkaapp.payload.Student;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "gubern", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format("Consuming the message from gubern Topuc:: %s", msg));
    }

    @KafkaListener(topics = "gubern", groupId = "myGroup")
    public void consumeJsonMsg(Student student){
        log.info(String.format("Consuming the message from gubern Topuc:: %s", student.toString()));
    }
}

