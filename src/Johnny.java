
public class Johnny extends Player {

	public Roshambo generateRoshambo(String input) {
		if (input.equalsIgnoreCase("rock")) {
			return Roshambo.ROCK;
		} else if (input.equalsIgnoreCase("scissors")) {
			return Roshambo.SCISSORS;
		} else {
			return Roshambo.PAPER;
		}
	}

	@Override
	public Roshambo generateRoshambo() {
		return null;
	}

}
