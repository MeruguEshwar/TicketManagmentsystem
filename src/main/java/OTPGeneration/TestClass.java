package OTPGeneration;

import java.util.Random;
import java.util.Scanner;

import com.ojas.dao.TicketDAOImpl;

public class TestClass {
		TicketDAOImpl tdao = new TicketDAOImpl();
		
		public int otp;
		
		public TestClass(int otp) {
			this.otp = otp;
		}
		
		public TestClass(){
			
		}
		public int getOtp() {
			return otp;
		}

		public void setOtp(int otp) {
			this.otp = otp;
		}

			public void GenerateOtp() {
				Random r = new Random();
				System.out.println("Please Login With Your Mobile Number:");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Your Phone Number:");
				String n = sc.next();
				otp = r.nextInt(1000000);
					for(int i=1;i<=1;i++) {
						System.out.println("Your OTP is:"+otp);
					}
			}
			
			public int GenerateTicketSeats() {
				Random r = new Random();
				int seatNumber = r.nextInt(tdao.numberOfSeats);
				for(int i=1;i<=1;i++) {
					System.out.println("Your Seat Number is:"+seatNumber);
				}
				return seatNumber;
			
		}

}
