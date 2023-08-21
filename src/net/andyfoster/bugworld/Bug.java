package net.andyfoster.bugworld;

public class Bug {

	private String species;
	private String name;
	private char symbol;
	private int x;
	private int y;
	private int energy;
	private int id;

	public Bug(String species, String name, char symbol, int x, int y, int energy, int id) {
		super();
		this.species = species;
		this.name = name;
		this.symbol = symbol;
		this.x = x;
		this.y = y;
		this.energy = energy;
		this.id = id;
	}

	public Bug() {
		super();
		this.species = "Weta";
		this.name = "Gary";
		this.symbol = 'G';
		this.x = 100;
		this.y = 120;
		this.energy = 300;
		this.id = 1;
	}

	@Override
	public String toString() {
		return this.name + " " + " the " + this.species;
	}

	public String toText() {
		return this.species + this.name + " " + this.symbol + " " + this.x + " " + this.y + " " + this.energy + " "
				+ this.id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
