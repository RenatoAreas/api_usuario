package br.com.cotiinformatica.infrastructure.producers;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

	@Autowired
	private RabbitTemplate rebbitTemplate;

	@Autowired
	private Queue queue;

	
	public void send (String message) {
		rebbitTemplate.convertAndSend(this.queue.getName(), message);
	}
}