package net.andyfoster.bugworld;

public class Bug {

	private String species;
	private String name;
	private char symbol;
	private int x;
	private int y;
	private int energy;
	private int id;

	public Bug() {
		super();
		this.species = "Weta";
		this.name = "Gary";
		this.symbol = a;
		this.x = 100;
		this.y = 120;
		this.energy = 300;
		this.id = 1;
	}

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

}
