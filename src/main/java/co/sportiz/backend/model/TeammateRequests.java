package co.sportiz.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="teammate_request")
public class TeammateRequests {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@JsonIgnore
	private long id;
	
	@Column
	@JsonProperty
	private String name;
	
	@Column(name="mobile_number")
	@JsonProperty("mobile")
	private String mobileNubmer;
	
	@Column
	@JsonProperty("msg")
	private String message;
	
	@Column
	@JsonIgnore
	private double latitude;
	
	@Column
	@JsonIgnore
	private double longitude;
	
	private double[] cordinates;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNubmer() {
		return mobileNubmer;
	}

	public void setMobileNubmer(String mobileNubmer) {
		this.mobileNubmer = mobileNubmer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	@JsonProperty("coord")
	public double[] getCordinates() {
		cordinates = new double[] { this.latitude, this.longitude };
		return cordinates;
	}
}
