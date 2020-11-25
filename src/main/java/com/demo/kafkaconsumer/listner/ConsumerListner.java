package com.demo.kafkaconsumer.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.kafkaconsumer.model.User;

@Service
public class ConsumerListner {

	@KafkaListener(topics = "Kafka_example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message is : "+message);
		
	}
	
	@KafkaListener(topics = "Kafka_example_json", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("User details are : "+user);
	}
}
