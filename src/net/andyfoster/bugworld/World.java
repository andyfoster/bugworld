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

	public void drawWorld() {

		System.out.println("|-----------------------------|");

		// Logic to work out where to put bugs

		StringBuilder sb = new StringBuilder();
//
		for (int i = 0; i < height; i++) {
			for (Bug b : bugs) {
				if (b.getY() == i) {
					sb.append(b.getSymbol());
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}

		System.out.println("|                             |");
		System.out.println("|-----------------------------|");
	}

}
