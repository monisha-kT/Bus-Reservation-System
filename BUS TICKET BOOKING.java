BUS TICKET BOOKING

import java.util.*;
public class Busticket {
	public static void main(String[] args) {
		System.out.println("SAFE MOVERS happily welcomes you:)\nChoose an option\n 1.Already a user\n 2.Create new one\n");
		Scanner obj=new Scanner(System.in);
		int seatavail=50;
		int option=obj.nextInt();
		if(option==1)
		{
			System.out.print("Enter username:");
			Scanner obj1=new Scanner(System.in);
			String username=obj1.nextLine();
			System.out.print("Enter password:");
			String password=obj1.nextLine();
		}
		else 
		{
			Scanner obj2=new Scanner(System.in);
			System.out.print("First name:");
			String fname=obj2.nextLine();
			System.out.print("Last name:");
			String lname=obj2.nextLine();
			Scanner obj3=new Scanner(System.in);
			System.out.print("Phone number:");
			long Phno=obj3.nextLong();
			System.out.print("Email id:");
			String email=obj2.nextLine();
			
			}
		
		System.out.println("Choose the destination\n1.Karur to Chennai\n2.Karur to Coimbatore\n3.Karur to Trichy\n"
				+"4.Karur to Salem");
		int route=obj.nextInt();
		switch(route)
		{
		case 1:
			System.out.println("1.Bus name:PKP Travels\n Time:6.25 a.m\nReaching time:7(hrs)\nSeat Availability=50");
			System.out.println("2.Bus name:SVM Travels\n Time:7.25 p.m\nReaching time:7(hrs)\nSeat Availability=50");
			System.out.println("choose busno:");
			int busno=obj.nextInt();
			if(busno==1) {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
				
				for(int i=1;i<=count;i++)
			{
				Scanner obj5=new Scanner (System.in);
				System.out.println("Name of the person:");
				String name=obj5.nextLine();
				System.out.println("Age:");
				int age=obj.nextInt();
				System.out.println("Gender:");
				String gender=obj5.nextLine();
				if(age<=10) {
					System.out.println(name+"is booked for LOWER BERTH");
				}
				else if (age>10&&age<=50) {
					System.out.println(name+"is booked for UPPER BERTH");
				}
				else {
					System.out.println(name+"is booked for LOWER BERTH");
				}
					
			}
			}
			else {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
				
			for(int i=1;i<=count;i++)
			{
				Scanner obj4=new Scanner (System.in);
				System.out.println("Name of the person:");
				String name=obj4.nextLine();
				System.out.println("Age:");
				int age=obj.nextInt();
				System.out.println("Gender:");
				String gender=obj4.nextLine();
				if(age<=10) {
					System.out.println(name+"is booked for LOWER BERTH");
				}
				else if (age>10&&age<=50) {
					System.out.println(name+"is booked for UPPER BERTH");
				}
				else {
					System.out.println(name+"is booked for LOWER BERTH");
				}
			}
				
			}
	
			break;
		case 2:
			System.out.println("1.Bus name:PRT Travels\n Time:6.25 a.m\nReaching time:3(hrs)\nSeat Availability=50");
			System.out.println("2.Bus name:JACK Travels\n Time:7.25 p.m\nReaching time:3(hrs)\nSeat Availability=50");
			System.out.println("choose busno:");
			int busno1=obj.nextInt();
			if(busno1==1) {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
				for(int i=1;i<=count;i++)
				{
					Scanner obj4=new Scanner (System.in);
					System.out.println("Name of the person:");
					String name=obj4.nextLine();
					System.out.println("Age:");
					int age=obj.nextInt();
					System.out.println("Gender:");
					String gender=obj4.nextLine();
					if(age<=10) {
						System.out.println(name+"is booked for LOWER BERTH");
					}
					else if (age>10&&age<=50) {
						System.out.println(name+"is booked for UPPER BERTH");
					}
					else {
						System.out.println(name+"is booked for LOWER BERTH");
					}
						
					
				}
				}
			else {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
				for(int i=1;i<=count;i++)
				{
					Scanner obj4=new Scanner (System.in);
					System.out.println("Name of the person:");
					String name=obj4.nextLine();
					System.out.println("Age:");
					int age=obj.nextInt();
					System.out.println("Gender:");
					String gender=obj4.nextLine();
					if(age<=10) {
						System.out.println(name+"is booked for LOWER BERTH");
					}
					else if (age>10&&age<=50) {
						System.out.println(name+"is booked for UPPER BERTH");
					}
					else {
						System.out.println(name+"is booked for LOWER BERTH");
					}
						
					
				}
				}
			break;
		case 3:
			System.out.println("1.Bus name:MSB Travels\n Time:9.25 a.m\nReaching time:1.5(hrs)\nSeat Availability=50");
			System.out.println("2.Bus name:RUBY Travels\n Time:7.25 p.m\nReaching time:1.5(hrs)\nSeat Availability=50");
			System.out.println("choose busno:");
			int busno2=obj.nextInt();
			if(busno2==1) {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
						for(int i=1;i<=count;i++)
						{
							Scanner obj4=new Scanner (System.in);
							System.out.println("Name of the person:");
							String name=obj4.nextLine();
							System.out.println("Age:");
							int age=obj.nextInt();
							System.out.println("Gender:");
							String gender=obj4.nextLine();
							if(age<=10) {
								System.out.println(name+"is booked for LOWER BERTH");
							}
							else if (age>10&&age<=50) {
								System.out.println(name+"is booked for UPPER BERTH");
							}
							else {
								System.out.println(name+"is booked for LOWER BERTH");
							}
								
							
						}
				}

			else {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
				for(int i=1;i<=count;i++)
				{
					Scanner obj4=new Scanner (System.in);
					System.out.println("Name of the person:");
					String name=obj4.nextLine();
					System.out.println("Age:");
					int age=obj.nextInt();
					System.out.println("Gender:");
					String gender=obj4.nextLine();
					if(age<=10) {
						System.out.println(name+"is booked for LOWER BERTH");
					}
					else if (age>10&&age<=50) {
						System.out.println(name+"is booked for UPPER BERTH");
					}
					else {
						System.out.println(name+"is booked for LOWER BERTH");
					}
						
					
				}
				
				}
			
			break;
		case 4:
			System.out.println("1.Bus name:NPR Travels\n Time:6.25 a.m\nReaching time:3(hrs)\nSeat Availability=50");
			System.out.println("2.Bus name:JACK Travels\n Time:8.25 p.m\nReaching time:3(hrs)\nSeat Availability=50");
			System.out.println("choose busno:");
			int busno3=obj.nextInt();
			if(busno3==1) {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
				for(int i=1;i<=count;i++)
				{
					Scanner obj4=new Scanner (System.in);
					System.out.println("Name of the person:");
					String name=obj4.nextLine();
					System.out.println("Age:");
					int age=obj.nextInt();
					System.out.println("Gender:");
					String gender=obj4.nextLine();
					if(age<=10) {
						System.out.println(name+"is booked for LOWER BERTH");
					}
					else if (age>10&&age<=50) {
						System.out.println(name+"is booked for UPPER BERTH");
					}
					else {
						System.out.println(name+"is booked for LOWER BERTH");
					}
						
					
				}
				}
		
			else {
				System.out.print("Required Seats:");
				int count=obj.nextInt();
				
					seatavail=seatavail-count;
				
				if(seatavail<count)
					System.out.println("The seats are unavailable");
				else
					System.out.println("The seats are available");
				for(int i=1;i<=count;i++)
				{
					Scanner obj4=new Scanner (System.in);
					System.out.println("Name of the person:");
					String name=obj4.nextLine();
					System.out.println("Age:");
					int age=obj.nextInt();
					System.out.println("Gender:");
					String gender=obj4.nextLine();
					if(age<=10) {
						System.out.println(name+"is booked for LOWER BERTH");
					}
					else if (age>10&&age<=50) {
						System.out.println(name+"is booked for UPPER BERTH");
					}
					else {
						System.out.println(name+"is booked for LOWER BERTH");
					}
						
					
				}
				}
			break;
		}
		
        System.out.println("THANKS FOR APPROACHING!!!");
	}

}
