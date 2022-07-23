package com.ojas.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.ojas.main.MainCls;
import com.ojas.model.Theater;

class NumberInvalidException extends RuntimeException {
	NumberInvalidException(String msg) {
		super(msg);
	}
}

public class TheaterDAOImpl implements TheaterDAO {

	public static List<Theater> originaList = new ArrayList<Theater>();
	public static List<Theater> tempList = new ArrayList<Theater>();
	Scanner sc = new Scanner(System.in);
	static Theater theater = null;
	String msg = "";
	int TheaterCapacityValue;

	public void addTHEATER() {
		int n = 1;
		while (n == 1) {
			theater = new Theater();// Created one empty product object
			System.out.println("Enter theater Id ?");
			String num = sc.next();
			while (!Pattern.matches("[0-9]*", num)) {
				try {
					throw new NumberInvalidException("Please Enter Valid Numbers Only...");
				} catch (Exception e) {
					System.out.println("Pls Enter Valid Numbers Only");
					num = sc.next();
				}
			}
			int theid = Integer.parseInt(num);// Wrapper Cls
			theater.setTheaterID(theid);

			System.out.println("Enter theater Name ?");
			theater.setTheaterName(sc.next());

			System.out.println("Enter theater Capacity ?");
			TheaterCapacityValue = theater.setTheaterCapacity(sc.nextInt());

			System.out.println("Enter theater Type ?");
			theater.setTheaterType(sc.next());

			System.out.println("Enter theater Location ?");
			theater.setTheaterLocation(sc.next());

			originaList.add(theater);// storing your product in to list

			System.out.println("Do you want to add more Theater press 1 else any number");
			n = sc.nextInt();
		}
		System.out.println("Successfully Theater added.....");
	}

	public double theatercapacity() {
		return theater.getTheaterCapacity();
	}

//	public Theater viewTheater(int theaterID) {
//		Theater theater = new Theater();
//		for (Theater searchTheater : originaList) {
//			if (searchTheater.getTheaterID() == theaterID) {
//				theater = searchTheater;
//				break;
//			}
//		}
//		return theater;
//	}

	public List<Theater> viewTheater(int theaterID) {
		List<Theater> theater = originaList.stream().filter(tid -> tid.getTheaterID() == theaterID)
				.collect(Collectors.toList());
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
					updateTheater.setTheaterCapacity(sc.nextInt());
				} else if (ch == 3) {
					System.out.println("Enter Updated Theater Type ?");
					updateTheater.setTheaterType(sc.next());
				} else if (ch == 4) {
					System.out.println("Enter Updated Theater Location ?");
					updateTheater.setTheaterLocation(sc.next());
				} else {
					System.out.println("Sorry your Theater not available....");
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
		System.out.println("Successfully Theater Updated....");
	}

	public void deleteTheater(int theaterID) {
		tempList = new ArrayList<Theater>();
		for (Theater updateTheater : originaList) {
			if (updateTheater.getTheaterID() == theaterID) {
			} else {
				tempList.add(updateTheater);
			}
		}
		originaList = new ArrayList<Theater>();
		for (Theater updatedTheater : tempList) {
			originaList.add(updatedTheater);
		}
		System.out.println("Successfully Theater Deleted....");
	}

	public void back() {
		MainCls.main(null);
	}
}
