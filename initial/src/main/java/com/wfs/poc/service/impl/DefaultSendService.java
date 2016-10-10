package com.wfs.poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfs.poc.messaging.MessageSender;
import com.wfs.poc.model.Message;
import com.wfs.poc.service.SendService;


@Service("sendService")
public class DefaultSendService implements SendService {
	
	@Autowired
	MessageSender messageSender;

	@Override
	public String sendMessageToQueue(String messageString) {
		Message message = new Message(messageString);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
