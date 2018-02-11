package co.sportiz.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="context_menu")
public class ContextMenuItem {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column
	@JsonProperty
	private String name;
	
	@Column
	@JsonProperty
	private String icon;
	
	@Column
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
