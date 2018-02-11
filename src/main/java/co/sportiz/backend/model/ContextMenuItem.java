package co.sportiz.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContextMenuItem {

	@JsonProperty
	private String name;
	
	@JsonProperty
	private String icon;
	
	@JsonProperty
	private String value;
	
	public ContextMenuItem(String name, String icon, String value) {
		super();
		this.name = name;
		this.icon = icon;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public String getValue() {
		return value;
	}
	
	
}
