
public class Rock extends Player {

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	public Rock(String name) {
		super(name);
	}


}
