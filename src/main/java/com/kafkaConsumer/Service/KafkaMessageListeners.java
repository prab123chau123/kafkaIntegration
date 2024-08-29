package com.kafkaConsumer.Service;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafkaConsumer.Model.Employee;

@Service
public class KafkaMessageListeners {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(KafkaMessageListeners.class);

	@KafkaListener(topics = "topicUsigSpringBoot",groupId = "my-consumer-group")
	public void consumeMessage(Employee employee) {

		logger.info("Message data " + employee.toString());
//		System.out.println(employee.toString());
	}
}
