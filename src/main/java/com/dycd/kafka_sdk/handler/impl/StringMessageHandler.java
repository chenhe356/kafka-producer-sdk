package com.dycd.kafka_sdk.handler.impl;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import com.dycd.kafka_sdk.config.ProducerInit;
import com.dycd.kafka_sdk.core.ProducerCore;
import com.dycd.kafka_sdk.handler.MessageCallBackHandler;
import com.dycd.kafka_sdk.handler.SendMessageHandlerInterface;

public class StringMessageHandler implements SendMessageHandlerInterface {

	private String topic;

	private String key;

	private String value;

	private int partition;
	

	public StringMessageHandler(String topic, int partition, String key, String value) {
		this.topic = topic;
		this.partition = partition;
		this.key = key;
		this.value = value;
	}
	@Override
	public void send(MessageCallBackHandler callBackHandler) {
		Producer<String, String> producer = new KafkaProducer<>(ProducerInit.PRODUCER_PROP);
		ProducerCore sendEngine = new ProducerCore(producer);
		sendEngine.sendMessage(topic, partition, key, value, callBackHandler);
	}

}
