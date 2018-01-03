package com.dycd.kafka_sdk.handler.impl;

import com.dycd.kafka_sdk.handler.MessageCallBackHandler;
import kafka.utils.Json;
import org.apache.kafka.clients.producer.RecordMetadata;
import scala.util.parsing.json.JSON;

import java.util.HashMap;
import java.util.Map;

public class ShowMessageCallBackHandler implements MessageCallBackHandler {

	@Override
	public void callBack(Object o) {
		// TODO Auto-generated method stub
		RecordMetadata meta = (RecordMetadata)o;
		Map<String,Object> params = new HashMap<>(16);
		params.put("offset",meta.offset());
		params.put("partition",meta.partition());
		params.put("topic",meta.topic());
		System.out.println(com.alibaba.fastjson.JSON.toJSON(params));
	}

}
