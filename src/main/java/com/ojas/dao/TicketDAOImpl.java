package com.ojas.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ojas.main.MainCls;
import com.ojas.model.Theater;
import com.ojas.model.Ticket;

public class TicketDAOImpl implements TicketDAO {

	public static List<Theater> originaList = new ArrayList<Theater>();
	public static List<Theater> tempList = new ArrayList<Theater>();
	static Scanner sc = new Scanner(System.in);
	static Theater theater = null;
	static int n = 1;
	String msg = "";
	int choice;
	int numberOfSeats;
	int res;

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

	public void updateTheater(int theaterID) {
		tempList = new ArrayList<Theater>();
		for (Theater updateTheater : originaList) {
			if (updateTheater.getTheaterID() == theaterID) {
				System.out.println(
						"Select Your choice : 1. Theater Name 2. Theater Capacity 3.Theater Type 4.Theater Location");
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println("Enter Updated Theater Name ?");
					updateTheater.setTheaterName(sc.next());
				} else if (ch == 2) {
					System.out.println("Enter Updated Theater Capacity ?");
					updateTheater.setTheaterCapacity(sc.nextDouble());
				} else if (ch == 3) {
					System.out.println("Enter Updated Theater Type ?");
					updateTheater.setTheaterType(sc.next());
				} else if (ch == 4) {
					System.out.println("Enter Updated Theater Location ?");
					updateTheater.setTheaterLocation(sc.next());
				} else {
					System.out.println("Sorry your product not available....");
				}
				tempList.add(updateTheater);
			} else {
				tempList.add(updateTheater);
			}

		}
		originaList = new ArrayList<Theater>();
		for (Theater updatedTheater : tempList) {
			originaList.add(updatedTheater);
		}
		System.out.println("Successfully Product Updated....");

	}

	public void deleteTheater(int theaterID) {
		tempList = new ArrayList<Theater>();
		for (Theater updateProduct : originaList) {
			if (updateProduct.getTheaterID() == theaterID) {

			} else {
				tempList.add(updateProduct);
			}

		}
		originaList = new ArrayList<Theater>();
		for (Theater updatedProduct : tempList) {
			originaList.add(updatedProduct);
		}
		System.out.println("Successfully Product Deleted....");

	}

	public void back() {
		MainCls.main(null);

	}

	public void TicketBooking() {
		// TODO Auto-generated method stub
		System.out.println("If You Want to Book the tickets 1.Bookings 2.exit");
		choice = sc.nextInt();

		System.out.println("Press 1.UpperBalconey");
		System.out.println("Press 2.MiddleBalconey");
		System.out.println("Press 3.LowerBalconey");
		int balconey = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("How Many Seates Do you want");
			numberOfSeats = sc.nextInt();
			switch (balconey) {
			case 1:
				UpperBolconey();
				break;
			case 2:
				MiddleBolconey();
				break;
			case 3:
				LowerBolconey();
				break;
			default:
				System.out.println("Invalid Pls try again..");
			}
		case 2:
		}

	}

	public void UpperBolconey() {
		int cost = 100;
		int res = numberOfSeats * cost;
		System.out.println("Bill amont is:" + res);
		System.out.println("Please pay the Bill amont:");
		int amont = sc.nextInt();
		if(amont == res) {
			System.out.println("Bill Paid Successfully");
		}else {
			System.out.println("Payment Failed...?");
		}
	}

	public void MiddleBolconey() {
		int cost = 50;
		res = numberOfSeats * cost;
		System.out.println("Bill amont is:" + res);
		System.out.println("Please pay the Bill amont:");
		int amont = sc.nextInt();
		if(amont == res) {
			System.out.println("Bill Paid Successfully");
		}else {
			System.out.println("Payment Failed...?");
		}
	}

	public void LowerBolconey() {
		int cost = 30;
		int res = numberOfSeats * cost;
		System.out.println("Bill amont is:" + res);
		System.out.println("Please pay the Bill amont:");
		int amont = sc.nextInt();
		if(amont == res) {
			System.out.println("Bill Paid Successfully");
		}else {
			System.out.println("Payment Failed...?");
		}
	}
	
	

	public void updateProduct(int productId) {
		// TODO Auto-generated method stub

	}

	public void deleteProduct(int prodoctId) {
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
