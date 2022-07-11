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
	static Scanner sc = new Scanner(System.in);
	static Theater theater = null;
	static int n = 1;
	String msg = "";
	static int choice;
	public static int numberOfSeats;
	static int res;
	static int MiddleBolconeySeats = 20;
	static int LowerconeySeats = 20;
	static int UpperBolconeySeats = 20;
	int Totalseatscapacity = MiddleBolconeySeats + LowerconeySeats + UpperBolconeySeats;
	int AvailableTickets;
	static int TheaterName;
	static TheaterDAOImpl tdi = new TheaterDAOImpl();
	
	public static void getcustomertheatername() {
			System.out.println(tdi.viewAllTheaters());
			
			System.out.println("Choose Your Theater...");
			TheaterName = sc.nextInt();
//			if(tdi.originaList.get()==TheaterName) {
//				
//			}
			for(Theater nani:tdi.originaList) {
				if(nani.getTheaterID() == TheaterName) {
					System.out.println("Welcome to theater:");
					//System.out.println(nani.getTheaterID());
				}else {
					System.out.println("Entered theater id not found..");
				}
				
			}
			
	}

	public void TicketBooking() {
		System.out.println("Total Theater seat capacity :" + Totalseatscapacity);
        System.out.println("If You Want to Book the tickets");
        System.out.println("Press 1.Bookings");
        System.out.println("Press 2.exit");
        int choice = sc.nextInt();


        switch (choice) {
        case 1:
            System.out.println("Press 1.UpperBalconey");
            System.out.println("Press 2.MiddleBalconey");
            System.out.println("Press 3.LowerBalconey");
            int balconey = sc.nextInt();
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
            break;
        case 2: System.out.println("Please Enter Valid Option:");
                break;
        default:System.out.println("Invalid pls try again..");
        }		
	}

	public static void UpperBolconey() {
		System.out.println("TotalSeats Available in UpperBolconey:" + UpperBolconeySeats);
		int UAvailableSeats = UpperBolconeySeats - numberOfSeats;
		
		System.out.println("Available " + UAvailableSeats);
		int cost = 100;
		int res = numberOfSeats * cost;
		System.out.println("Bill amont is:" + res);
		System.out.println("Please pay the Bill amont:");
		int amont = sc.nextInt();
			if (amont == res) {
				System.out.println("Bill Paid Successfully");
			} else {
				System.out.println("Payment Failed...?");
			}
	}

	public static void MiddleBolconey() {
		System.out.println("TotalSeats Available in MiddleBolconey: " + MiddleBolconeySeats);
		int MAvailableSeats = MiddleBolconeySeats - numberOfSeats;
		System.out.println("Available " + MAvailableSeats);
		int cost = 50;
		res = numberOfSeats * cost;
		System.out.println("Bill amont is:" + res);
		System.out.println("Please pay the Bill amont:");
		int amont = sc.nextInt();
			if (amont == res) {
				System.out.println("Bill Paid Successfully");
			} else {
				System.out.println("Payment Failed...?");
			}
	}

	public static void LowerBolconey() {
		System.out.println("TotalSeats Available in LowerBolconey: " + LowerconeySeats);
		int LAvailableSeats = LowerconeySeats - numberOfSeats;
		System.out.println("Available " + LAvailableSeats);
		int cost = 30;
		int res = numberOfSeats * cost;
		System.out.println("Bill amont is:" + res);
		System.out.println("Please pay the Bill amont:");
		int amont = sc.nextInt();
			if (amont == res) {
				System.out.println("Bill Paid Successfully");
				LowerconeySeats = LAvailableSeats;
			} else {
				System.out.println("Payment Failed...?");
			}

	}

	public Ticket viewTickets(int productId) {
		return null;
	}

	public List<Ticket> viewAllTickets() {
		return null;
	}

}
