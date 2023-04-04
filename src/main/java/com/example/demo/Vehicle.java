package com.example.demo;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Component
@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vehicleNo;
	private String vehicleType;
	private String vehicleModel;
	private long mobileNo;
	private String customerName;
	
	private Date checkInTime;
	private Date checkOutTime;
	
	public int getId() {
		return id;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}
	
	public Date getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + ", vehicleModel=" + vehicleModel
				+ ", mobileNo=" + mobileNo + ", customerName=" + customerName + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}

	 public void checkOut() {
	        checkOutTime = new Date();
	        System.out.println("Check out successful at " + this.checkOutTime);
	        long duration = this.checkOutTime.getTime() - this.checkInTime.getTime();
	        duration /= 1000; // convert to seconds
	        duration /= 60; // convert to minutes
	        int amount = 10;
	        if (duration > 30) {
	            amount += (duration - 30) / 30 * 10;
	        }
	
	
}
}
