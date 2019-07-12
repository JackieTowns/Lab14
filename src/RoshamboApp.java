import java.util.Scanner;

public class RoshamboApp {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		Player rockPlayer = new Rock("Yoona");
		Player randomPlayer = new Randrago();
		Player humanPlayer = new Johnny(); // Also can say Johnny humanPlayer
		
		boolean boo = true; 
		String input; 
		Roshambo r1 = null;
		Roshambo r2 = null;
		


		// System.out.println(r1 + " " + r2);

		System.out.println("Welcome to the RockPaperScissors Game!!\n");

		System.out.println("Name please...\n");
		String name = scnr.nextLine();
		humanPlayer.setName(name);

	
		do {
		input = Validator.getString(scnr, "Enter rock, paper or scissors!\n");
		//System.out.println("Enter rock, paper or scissors!\n");
//			String input = scnr.nextLine();
			if (input.toLowerCase().startsWith("r") || input.toLowerCase().startsWith("p")
					|| input.toLowerCase().startsWith("s")) {
			boo= false;
			} 
		
		} while (boo);
		
		r1 = humanPlayer.generateRoshambo(input);
		
		do { 
			input = Validator.getString(scnr, "Would you like to play against Rock or Random?");
				
			if (input.equalsIgnoreCase("rock")) {
				r2 = rockPlayer.generateRoshambo();
				boo = false;
			} else if (input.equalsIgnoreCase("Randrago")) {
				r2 = randomPlayer.generateRoshambo();
				boo = false;
			}else { 
				System.out.println("Sorry! Try Rock or Randrago");
				boo = true; 
			}

		}while(boo); 
		
		System.out.println(r1);
		System.out.println(r2);


		findingWinner(r1, r2);

		System.out.println("Have a nice day!");

	
	
		scnr.close();
	
	}

	public static void findingWinner(Roshambo r1, Roshambo r2) {
		if (r1 == r2) {
			System.out.println("Tie");
		}else if ((r1.equals(Roshambo.ROCK)&&r2.equals(Roshambo.SCISSORS)|| (r1.equals(Roshambo.SCISSORS)&&r2.equals(Roshambo.PAPER) ||
						(r1.equals(Roshambo.PAPER) && r2.equals(Roshambo.ROCK))))) {
			System.out.println("You Win!");
			
		} else {
			System.out.println("You Lose!");
		}

	}
}
