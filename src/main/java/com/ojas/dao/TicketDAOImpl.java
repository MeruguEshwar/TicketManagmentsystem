package com.ojas.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ojas.main.MainCls;
import com.ojas.model.Theater;
import com.ojas.model.Ticket;

import OTPGeneration.TestClass;

public class TicketDAOImpl implements TicketDAO {

	public static List<Theater> originaList = new ArrayList<Theater>();
	public static List<Theater> tempList = new ArrayList<Theater>();
	Theater the = new Theater();
	Scanner sc = new Scanner(System.in);
	int NumberOfSeats;
	int TheaterName;
	TheaterDAOImpl tdi = new TheaterDAOImpl();

	public void getcustomertheatername() {
		System.out.println(tdi.viewAllTheaters());
		System.out.println("Choose Your Theater...");
		TheaterName = sc.nextInt();
		for (Theater theater : tdi.originaList) {
			if (theater.getTheaterID() == TheaterName) {
				System.out.println("Welcome to theater:");
			} else {
				System.out.println("Entered theater id not found..");
			}
		}
	}

	public void TicketBooking() {
		double totseats = the.getTheaterCapacity();
		int totcapacity = (int) totseats;
		System.out.println("Total Theater seat capacity :" + totcapacity);
		System.out.println("If You Want to Book the tickets");
		System.out.println("Press 1.Bookings");
		System.out.println("Press 2.exit");
		int Choice = sc.nextInt();

		switch (Choice) {
		case 1:
			System.out.println("Press 1.UpperBalconey");
			System.out.println("Press 2.MiddleBalconey");
			System.out.println("Press 3.LowerBalconey");
			int balconey = sc.nextInt();

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

			break;
		case 2:
			System.out.println("Please Enter Valid Option:");
			break;
		default:
			System.out.println("Invalid pls try again..");
		}
	}

	public void UpperBolconey() {
		double ubolconey = the.getTheaterCapacity() * 50 / 100;
		int UpperBolconeyTickets = (int) ubolconey;
		System.out.println("TotalSeats Available in UpperBolconey:" + UpperBolconeyTickets);
		System.out.println("How Many Seates Do you want");
		NumberOfSeats = sc.nextInt();
		if (NumberOfSeats <= UpperBolconeyTickets) {
			int UperavailableSeats = UpperBolconeyTickets - NumberOfSeats;
			System.out.println("Available: " + UperavailableSeats);
			int cost = 100;
			int res = NumberOfSeats * cost;
			System.out.println("Bill amont is:" + res);
			System.out.println("Please pay the Bill amont:");
			int amont = sc.nextInt();
			if (amont == res) {
				System.out.println("Bill Paid Successfully");
			} else {
				System.out.println("Payment Failed...?");
			}
		} else {
			System.out.println("The Number Of Seats are Exceeded..");
		}
	}

	public void MiddleBolconey() {
		double mbolconey = the.getTheaterCapacity() * 30 / 100;
		int MiddleBolconeyTickets = (int) mbolconey;
		System.out.println("TotalSeats Available in MiddleBolconey: " + MiddleBolconeyTickets);
		System.out.println("How Many Seates Do you want");
		NumberOfSeats = sc.nextInt();
		if (NumberOfSeats <= MiddleBolconeyTickets) {
			int MAvailableSeats = MiddleBolconeyTickets - NumberOfSeats;
			System.out.println("Available: " + MAvailableSeats);
			int cost = 50;
			int res = NumberOfSeats * cost;
			System.out.println("Bill amont is:" + res);
			System.out.println("Please pay the Bill amont:");
			int amont = sc.nextInt();
			if (amont == res) {
				System.out.println("Bill Paid Successfully");
			} else {
				System.out.println("Payment Failed...?");
			}
		} else {
			System.out.println("The Number Of Seats are Exceeded..");
		}
	}

	public void LowerBolconey() {
		double lbolconey = the.getTheaterCapacity() * 20 / 100;
		int LowerBolconeyTickets = (int) lbolconey;
		System.out.println("TotalSeats Available in LowerBolconey: " + LowerBolconeyTickets);
		System.out.println("How Many Seates Do you want");
		NumberOfSeats = sc.nextInt();
		if (NumberOfSeats <= LowerBolconeyTickets) {
			int LAvailableSeats = LowerBolconeyTickets - NumberOfSeats;
			System.out.println("Available:" + LAvailableSeats);
			int cost = 30;
			int res = NumberOfSeats * cost;
			System.out.println("Bill amont is:" + res);
			System.out.println("Please pay the Bill amont:");
			int amont = sc.nextInt();
			if (amont == res) {
				System.out.println("Bill Paid Successfully");

			} else {
				System.out.println("Payment Failed...?");
			}
		} else {
			System.out.println("The Number Of Seats are Exceeded..");
		}

	}

	

	public void viewAllTickets() {
		System.out.println(the.getTheaterCapacity());
	}

}
