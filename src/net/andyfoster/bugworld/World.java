package net.andyfoster.bugworld;

import java.util.ArrayList;

public class World {

	private ArrayList<Bug> bugs;
	private int height = 100;
	private int width = 100;

	public World() {
		bugs = new ArrayList<>();

		bugs.add(new Bug("Steve", "Spider", 'S', 20, 40, 30, 1));
		bugs.add(new Bug("Charles", "Cockroach", 'C', 30, 50, 30, 2));

	}

	public static void main(String[] args) {

	}

}
