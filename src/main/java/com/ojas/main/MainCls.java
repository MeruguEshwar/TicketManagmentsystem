package com.ojas.main;

import java.util.Scanner;

import com.ojas.AdminMenu.TheterDetails;
import com.ojas.dao.TheaterDAOImpl;
import com.ojas.dao.TicketDAOImpl;

import OTPGeneration.TestClass;

public class MainCls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TheterDetails theaterDetails = new TheterDetails();
		TestClass testclass = new TestClass();
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("|  TICKET MANAGEMENT SYSTEM  |");
			System.out.println("-------------------------------");
			System.out.println("|     1. ADMIN                |");
			System.out.println("|     2. CUSTOMER             |");
			System.out.println("|     3. EXIT                 |");
			System.out.println("--------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				theaterDetails.adminMainMenu();
				break;
			case 2:
				testclass.GenerateOtp();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1-3 only");

			}
		}

	}

}
