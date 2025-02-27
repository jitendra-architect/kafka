package com.example.Kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = {"fruits"}, groupId = "abc")
	public void consumeMessage(String message) {
		System.out.print(message);
	}
}
