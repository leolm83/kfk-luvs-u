package com.leolmcoding.kfk_luvs_u;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KfkLuvsUApplication {
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(KfkLuvsUApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void run(){
		kafkaTemplate.send("meuTopico","Hello Kafka");
	}
}
