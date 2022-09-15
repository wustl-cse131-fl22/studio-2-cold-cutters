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
		boolean isDay = true;
		boolean game = true;
		int totalSimulations = 1;
		double random = Math.random();
		String progress;
		
		
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
			while(isDay) {
				System.out.println(day);
				boolean isSuccess = random <= winChance;
				if(isSuccess) {
					amount++;
					progress = "WIN";
				}
				else {
					amount--;
					progress = "LOSE";
				}
				System.out.println("Simulation "+totalSimulations+": "+amount+" "+progress);
				totalSimulations++;
			}
			
			/* Check for Ruin or Success */
			
			// Next Day
			
			day++;
					
		}

	}

}
