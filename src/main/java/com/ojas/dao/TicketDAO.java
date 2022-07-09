package com.ojas.dao;

import java.util.List;

import com.ojas.model.Theater;
import com.ojas.model.Ticket;


public interface TicketDAO {

	public Ticket viewTickets(int productId);
	public List<Ticket> viewAllTickets();
	
	public void TicketBooking();
}
