
public abstract class Player {
	private String name; // field

	public abstract Roshambo generateRoshambo();

	public Player() { // noargs constructor

	}

	public Player(String name) { // constructor
		// super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public Roshambo generateRoshambo(String input) {
		// TODO Auto-generated method stub
		return null;
	}



}
