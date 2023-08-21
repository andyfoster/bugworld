package net.andyfoster.bugworld;

import java.util.Scanner;

public class BugWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to BugWorld!");

		Bug b1 = new Bug();
		Bug b2 = new Bug("Barry", "Beetle", 'B', 100, 100, 23, 4);

		System.out.println(b1.toString());
		System.out.println(b2.toString());

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("y ");
		int y = sc.nextInt();
		System.out.print("energy: ");
		int energy = sc.nextInt();

		Bug b3 = new Bug("Bertie", "Bee", 'B', x, y, energy, 100);

		System.out.println(b3.toText());
	}
}
