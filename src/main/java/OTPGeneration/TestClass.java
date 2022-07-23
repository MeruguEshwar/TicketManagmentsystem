package OTPGeneration;

import java.util.Random;
import java.util.Scanner;

import com.ojas.dao.TheaterDAOImpl;
import com.ojas.dao.TicketDAOImpl;

import MobileValidation.NumberValidation;

public class TestClass {
	TicketDAOImpl tdao = new TicketDAOImpl();

	public int otp;

	public TestClass(int otp) {
		this.otp = otp;
	}

	public TestClass() {

	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public void GenerateOtp() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Please Login With Your Mobile Number:");
		System.out.println("Enter Your Phone Number:");
		String n = sc.next();

		NumberValidation number = new NumberValidation();
		if (number.isValidMobileNo(n)) {
			System.out.println("It is a valid mobile number:");
			otp = r.nextInt(1000000);
			for (int i = 1; i <= 1; i++) {
				System.out.println("Your OTP is:" + otp);
			}
			System.out.println("Enter OTP:");
			int otp = sc.nextInt();
			if (getOtp() == otp) {
				System.out.println("login Successfull...");
				TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();
				TheaterDAOImpl theaterDAOImpl = new TheaterDAOImpl();
				if (theaterDAOImpl.viewAllTheaters().isEmpty()) {
					System.out.println("No Theaters Found Please add Theaters..");
				} else {
					ticketDAOImpl.getcustomertheatername();
					ticketDAOImpl.TicketBooking();
				}
			} else {
				System.out.println("Invalid OTP Pls Try again Later...");
			}
		} else {
			System.out.println("Entered mobile number is invalid:");
		}

	}

//			public int GenerateTicketSeats() {
//				Random r = new Random();
//				int seatNumber = r.nextInt(tdao.NumberOfSeats);
//				for(int i=1;i<=1;i++) {
//					System.out.println("Your Seat Number is:"+seatNumber);
//				}
//				return seatNumber;
//			
//		}

}
