package org.kafka.producer.sdk;

import com.dycd.kafka_sdk.handler.MessageCallBackHandler;
import com.dycd.kafka_sdk.handler.SendMessageHandlerInterface;
import com.dycd.kafka_sdk.handler.impl.ShowMessageCallBackHandler;
import com.dycd.kafka_sdk.handler.impl.StringMessageHandler;

public class SendTest {
	public static void main(String[] args) {
		SendMessageHandlerInterface sender = new StringMessageHandler("fuck", 0, "1", "this is a very long test!");
		MessageCallBackHandler handler = new ShowMessageCallBackHandler();
		sender.send(handler);
	}
}
