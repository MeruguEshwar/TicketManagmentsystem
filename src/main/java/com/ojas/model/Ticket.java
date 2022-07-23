package com.ojas.model;

public class Ticket {
	private double ticketPrice;
	private int ticketId;
	private String ticketType;
	private int NumberOfTicket;

	public Ticket(double ticketPrice, int ticketId, String ticketType) {
		this.ticketPrice = ticketPrice;
		this.ticketId = ticketId;
		this.ticketType = ticketType;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String toString() {
		return ticketPrice + "\t" + ticketId + "\t" + ticketType;
	}
}
