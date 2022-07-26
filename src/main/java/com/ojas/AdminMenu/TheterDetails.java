package com.ojas.AdminMenu;

import java.util.List;
import java.util.Scanner;

import com.ojas.dao.TheaterDAOImpl;
import com.ojas.dao.TicketDAOImpl;
import com.ojas.model.Theater;

public class TheterDetails {

	Scanner sc = new Scanner(System.in);
	TheaterDAOImpl theaterdao = new TheaterDAOImpl();

	public void adminMainMenu() {
		System.out.println("--------------------------");
		System.out.println("|    ADMIN MAIN MENU     |");
		System.out.println("--------------------------");
		System.out.println("|   1. ADD THEATER       |");
		System.out.println("|   2. VIEW THEATER      |");
		System.out.println("|   3. VIEW ALL THEATER  |");
		System.out.println("|   4. UPDATE THEATER    |");
		System.out.println("|   5. DELETE THEATER    |");
		System.out.println("|   6. BACK              |");
		System.out.println("--------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			theaterdao.addTHEATER();
			adminMainMenu();
			break;
		case 2:
			System.out.println("Enter theaters Id ?");
			List<Theater> searchTheater = theaterdao.viewTheater(sc.nextInt());
			System.out.println("TheaterID" + "\t" + "TheaterNAME" + "\t" + "TheaterCapacity" + "\t" + "TheaterType"
					+ "\t" + "TheaterLocation");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------");
			System.out.println(searchTheater);
			adminMainMenu();
			break;
		case 3:
			List<Theater> the = theaterdao.viewAllTheaters();
			System.out.println("TheaterID" + "\t" + "TheaterNAME" + "\t" + "TheaterCapacity" + "\t" + "TheaterType"
					+ "\t" + "TheaterLocation");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
			for (Theater viewtheater : the) {
				System.out.println(viewtheater);
			}
			adminMainMenu();
			break;
		case 4:
			System.out.println("Which Theater do you want to update ?");
			theaterdao.updateTheater(sc.nextInt());
			adminMainMenu();
			break;
		case 5:
			System.out.println("Which Theater do you want to delete ?");
			theaterdao.deleteTheater(sc.nextInt());
			adminMainMenu();
			break;
		case 6:
			theaterdao.back();
			break;
		default:
			System.out.println("Please select your choice range 1-6 only");

		}
	}
}
