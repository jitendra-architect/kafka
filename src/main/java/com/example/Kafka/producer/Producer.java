package com.example.Kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

	@Autowired
	private KafkaTemplate kafkaTemplate;

	private final String topic = "fruits";

	@GetMapping("/send")
	public void sendMessage(@RequestParam String message) {
		kafkaTemplate.send(topic, message);
	}
}