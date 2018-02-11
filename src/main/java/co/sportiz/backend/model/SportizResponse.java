package co.sportiz.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SportizResponse {

	@JsonProperty
	private ResponseStatus status;
	
	@JsonProperty
	private String message;
	
	public SportizResponse(ResponseStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public static enum ResponseStatus {
		SUCCESS, FAILED;
	}
	
}

