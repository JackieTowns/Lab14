import java.util.Scanner;

public class RoshamboApp {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		Player rockPlayer = new Rock("Yoona");
		Player randomPlayer = new Randrago();
		Player humanPlayer = new Johnny(); // Also can say Johnny humanPlayer
		
		boolean boo = true; 
		String input; 
		Roshambo r1; 
		Roshambo r2; 
		Roshambo r3; 
		


		// System.out.println(r1 + " " + r2);

		System.out.println("Welcome to the RockPaperScissors Game!!\n");

		System.out.println("Name please...\n");
		String name = scnr.nextLine();
		humanPlayer.setName(name);

	
		do {
		input = Validator.getString(scnr, "Enter rock, paper or scissors!\n");
		//System.out.println("Enter rock, paper or scissors!\n");
		// String input = scnr.nextLine();
			if (input.toLowerCase().startsWith("r") || input.toLowerCase().startsWith("p")
					|| input.toLowerCase().startsWith("s")) {
			boo= false;
			} 
		
		} while (boo);
		
		
		do { 
			input = Validator.getString(scnr, "Would you like to play against Rock or Random?");
				
			if (input.equalsIgnoreCase("rock")) {
				r1 = rockPlayer.generateRoshambo();
			} else if (input.equalsIgnoreCase("Randrago")) {
		        r2 = randomPlayer.generateRoshambo();
			}else { 
				System.out.println("Sorry! Try Rock or Randrago");
				boo = true; 
			}

		}while(boo); 
		
		r3 = humanPlayer.generateRoshambo(input);

		// System.out.println(r3);

		System.out.println("Have a nice day!");
	
	
		scnr.close();
	
	}

}
