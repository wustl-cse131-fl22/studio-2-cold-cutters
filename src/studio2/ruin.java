package studio2;
import java.util.Scanner;

public class ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		double winChance;
		double winLimit;
		double ruinLimit;
		int day = 1;
		boolean game = true;
		int totalSimulations = 0;
		double random = Math.random();
		
		
		System.out.println("Enter Starting Amount: ");
		int startAmount = in.nextInt();
		int amount = startAmount;
		
		while(game) {
			System.out.println("Day: " + day);
			
			System.out.println ("What is your win chance?");
			winChance = in.nextDouble()/100.0; 
			System.out.println ("What is your win limit?");
			winLimit = in.nextDouble()/100.0; 
			System.out.println ("What is your ruin limit?");
			ruinLimit = in.nextDouble()/100.0; 
			
			/* Check for Ruin or Success */
			
			// Next Day
			//date
			day++;
					
		}

	}

}
