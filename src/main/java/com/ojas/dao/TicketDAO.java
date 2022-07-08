package com.ojas.dao;

import java.util.List;

import com.ojas.model.Theater;
import com.ojas.model.Ticket;


public interface TicketDAO {
	
	public void addTicket();
	
	public Ticket viewProduct(int productId);
	public List<Ticket> viewAllTickets();
	public void updateProduct(int productId);
	public void deleteProduct(int prodoctId);
	public void order();
	public void back();

	public void addTHEATER();
	public void viewTheater();
	public List<Theater> viewAllTheaters();
}
