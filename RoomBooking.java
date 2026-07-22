package staticpack;

import java.util.Scanner;

class Room{
	static int availableRooms=6;
	static void bookRoom() {
		if(availableRooms>0) {
		availableRooms--;
		System.out.println("room booked");
		}else {
			System.out.println("no available rooms");
		}
		System.out.println("number of available rooms : "+availableRooms);
	}
	static void checkOut() {
		if(availableRooms+1<6) {
			availableRooms++;
		System.out.println("number of available rooms : "+availableRooms);
		}
		else {
			System.out.println("reached maximum occupancy");
		}
	}
}
public class RoomBooking {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.booking");
			System.out.println("2.checkout");
			System.out.println("3.exit");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:Room.bookRoom();
			break;
			case 2:Room.checkOut();
			break;
			case 3:
				System.exit(0);
			
			}
			}while(true);
	}

}
