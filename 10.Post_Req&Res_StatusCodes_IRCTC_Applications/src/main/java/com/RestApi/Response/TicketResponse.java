package com.RestApi.Response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketResponse {
	private String name;
	private String dob;
	private String gender;
	private String date_of_Journey;
	private String from;
	private String to;
	private String train;
	
	private String status;
	private Double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_of_Journey() {
		return date_of_Journey;
	}
	public void setDate_of_Journey(String date_of_Journey) {
		this.date_of_Journey = date_of_Journey;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "TicketResponse [name=" + name + ", dob=" + dob + ", gender=" + gender + ", date_of_Journey="
				+ date_of_Journey + ", from=" + from + ", to=" + to + ", train=" + train + ", status=" + status
				+ ", price=" + price + "]";
	}
	

}
