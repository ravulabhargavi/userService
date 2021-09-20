package com.htc.userservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.Spring;

@Entity
@Table(name = "bookingdetails")
public class BookingDetails implements Serializable{
	private static final long serialVersionUID = -4686260504604541074L;
	@Id
	private long bookingId;
	@Column
	private long centreId;
	@Column
	private String pinCode;
	public BookingDetails(long bookingId, long  centreId, String pinCode) {
		super();
		this.bookingId = bookingId;
		this.centreId = centreId;
		this.pinCode = pinCode;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public long getCentreId() {
		return centreId;
	}
	public void setCentreId(long centreId) {
		this.centreId = centreId;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
		result = prime * result + (int) (centreId ^ (centreId >>> 32));
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
		BookingDetails other = (BookingDetails) obj;
		if (bookingId != other.bookingId)
			return false;
		if (centreId != other.centreId)
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
		return "BookingDetails [bookingId=" + bookingId + ", centreId=" + centreId + ", pinCode=" + pinCode + "]";
	}
	

}
