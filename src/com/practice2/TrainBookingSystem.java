package com.practice2;
import java.util.*;

public class TrainBookingSystem {

	static int seats[] = new int[10];
	
	public static void viewSeats() {
		System.out.println("seat status: ");
		for(int i=0;i<seats.length;i++) {
			if(seats[i]==0) {
				System.out.println("seats"+(i+1)+" : is avaliable");
			}
			else {
				System.out.println("seats"+(i+1)+" : is not avaliable");
			}
		}

	}
	
		public static void bookSeats(int seatNumber) {
			if(seatNumber<1 || seatNumber>10) {
				System.out.println("Invalid seat number");
				return;
			}
			if(seats[seatNumber-1]==0) {
				seats[seatNumber-1]=1;
				System.out.println("seat is booked successfully");
				
			}
			else {
				System.out.println("seat already booked");
			}
		}
		
		public static void cancelSeats(int seatNumber) {
			if(seats[seatNumber-1]==1) {
				seats[seatNumber-1]=0;
				System.out.println("Booking cancelled");
				
			}
			else {
				System.out.println("seat already available");
			}
		}
		
		
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		
    		System.out.println("1. view seats");
    		System.out.println("2. book seats");
    		System.out.println("3. cancel seats");
    		System.out.println("4. exist");
    		
    		int choice = sc.nextInt();
    		
    		switch(choice){
    			
    		case 1:
    			viewSeats();
    			break;
    			
    		case 2:
    			System.out.println("Enter the seat number: ");
    			int seat = sc.nextInt();
    			bookSeats(seat);
    			break;
    			
    		case 3: 
    			System.out.println("Enter the seat to cancel: ");
    			int cancel = sc.nextInt();
    			cancelSeats(cancel);
    			break;
    			
    		case 4:
    		System.exit(0);
    		break;
    		
    		default:
    			System.out.println("Invalid Choice");
    		}
    	}
    	
       
    }
}