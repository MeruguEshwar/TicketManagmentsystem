package com.ojas.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ojas.model.Theater;
import com.ojas.model.Ticket;



public class TicketDAOImpl implements TicketDAO{
	
	public static List<Theater> originaList = new ArrayList<Theater>();
	public static List<Theater> tempList = new ArrayList<Theater>();
	static Scanner sc = new Scanner(System.in);
	static Theater theater = null;
	static int n = 1;
	String msg = "";

	public void addTicket() {
		
		
	}
	
	public void addTHEATER() {
		while (n == 1) {
			theater = new Theater();// Created one empty product object
			// adding product details
			
			System.out.println("Enter theater Id ?");
			theater.setTheaterID(sc.nextInt());
			
			System.out.println("Enter theater Name ?");
			theater.setTheaterName(sc.next());
			
			System.out.println("Enter theater Capacity ?");
			theater.setTheaterCapacity(sc.nextInt());
			
			System.out.println("Enter theater Type ?");
			theater.setTheaterType(sc.next());
			
			System.out.println("Enter theater Location ?");
			theater.setTheaterLocation(sc.next());
			
			originaList.add(theater);// storing your product in to list
			
			System.out.println("Do you want to add more products press 1 else any number");
			n = sc.nextInt();
		}
		System.out.println("Successfully Products added.....");

		
	}

	public Theater viewTheater(int theaterID) {
		Theater theater = new Theater();
		for (Theater searchTheater : originaList) {
			if (searchTheater.getTheaterID() == theaterID) {
				theater = searchTheater;
				break;
			}
		}
		return theater;
	}

	public List<Theater> viewAllTheaters() {
		return originaList;
	}
	
	public List<Ticket> viewAllTheatesr() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public void updateProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(int prodoctId) {
		// TODO Auto-generated method stub
		
	}


	public void back() {
		// TODO Auto-generated method stub
		
	}

	public Ticket viewProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public void order() {
		// TODO Auto-generated method stub
		
	}

	

	public void viewTheater() {
		// TODO Auto-generated method stub
		
	}

	

	public List<Ticket> viewAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}

}
