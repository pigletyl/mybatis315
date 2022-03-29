package com.example.springbootkafka.Linster;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@Component
public class ConsumerLinster {
    @KafkaListener(topics = "repTopic",groupId = "consumerGroup")
    public <Stirng> void listernGroup(ConsumerRecord<String,String> record, Acknowledgment ack){
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
        ack.acknowledge();
    }

    @KafkaListener(topics = "repTopic",topicPartitions = {
            @TopicPartition(topic = "repTopic",partitions = {"0","1"}),
            @TopicPartition(topic = "repTopic",partitions = "0",partitionOffsets = @PartitionOffset(partition = "1",initialOffset = "5"))
    })
    public <Stirng> void listernGroupPro(ConsumerRecord<String,String> record, Acknowledgment ack){
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
        ack.acknowledge();
    }

}
