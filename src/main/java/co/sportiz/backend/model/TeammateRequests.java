package co.sportiz.backend.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="teammate_request")
public class TeammateRequests {

    @Id
    @SequenceGenerator(name="teammate_request_id_seq",
                       sequenceName="teammate_request_id_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="teammate_request_id_seq")
    @Column(updatable=false)
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
	private String sport;
	
	@Column
	@JsonIgnore
	private double latitude;
	
	@Column
	@JsonIgnore
	private double longitude;
	
	@Column
	@JsonIgnore
	private Timestamp createdTs;
	
	@Transient
	private double[] cordinates;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@NotNull
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull
	public String getMobileNubmer() {
		return mobileNubmer;
	}

	public void setMobileNubmer(String mobileNubmer) {
		this.mobileNubmer = mobileNubmer;
	}

	@NotNull
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@NotNull
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@NotNull
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

	@NotNull
	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public Timestamp getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}
	
}
