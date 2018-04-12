package co.sportiz.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

	@JsonProperty
	private String reciver;
	
	@JsonProperty
	private String sender;
	
	@JsonProperty
	private String content;
	
	@JsonProperty
	private long time;

	public Message() {
	
	}
	
	public Message(String reciver, String sender, String content, long time) {
		super();
		this.reciver = reciver;
		this.sender = sender;
		this.content = content;
		this.time = time;
	}

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
}
