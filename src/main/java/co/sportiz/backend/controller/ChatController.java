package co.sportiz.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import co.sportiz.backend.model.Message;

@Controller
@RequestMapping("/chat")
public class ChatController {

	private static final String QUEUE_PATH_LOCATOR = "/queue/chat-msg";
	@Autowired
	private SimpMessageSendingOperations messagingTemplate;
	
    @CrossOrigin
    @MessageMapping("/message")
    public String sendMessage(@RequestBody Message message) {
    	Map<String, Object> map = new HashMap<>();
		map.put(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON);
		this.messagingTemplate.convertAndSendToUser(message.getReciver(), QUEUE_PATH_LOCATOR, message.getContent(), map);
		System.out.println("Message pushed to queue for user "+message.getReciver()+" with content as "+message.getContent());
		return "SUCCESS";
    }
	
}
