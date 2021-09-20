package com.htc.userservice.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="centredetails")
public class CentreDetails {
	private static final long serialVersionUID = -4686260504604541074L;
    @Id
	private long centreId;
	@Column
	private String address;
	@Column
	private String pinCode;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column
    private LocalDateTime dateTime;
	public CentreDetails() {
		super();
	}
	
	private CentreDetails(long centreId,String address,String pinCode,LocalDateTime dateTime) {
		this.centreId=centreId;
		this.address=address;
		this.pinCode=pinCode;
		this.dateTime=dateTime;
		}

	public long getCentreId() {
		return centreId;
	}

	public void setCentreId(long centreId) {
		this.centreId = centreId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (centreId ^ (centreId >>> 32));
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CentreDetails other = (CentreDetails) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (centreId != other.centreId)
			return false;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (pinCode == null) {
			if (other.pinCode != null)
				return false;
		} else if (!pinCode.equals(other.pinCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CentreDetails [centreId=" + centreId + ", address=" + address + ", pinCode=" + pinCode + ", dateTime="
				+ dateTime + "]";
	}

	

}
