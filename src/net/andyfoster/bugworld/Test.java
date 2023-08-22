package net.andyfoster.bugworld;

import java.util.Scanner;

public class Test {

	private String b1name;
	private String b2name;

	// the constructor test is used to call
	public Test() {
		this.testOne();
		this.testTwo();

	}

	public static void main(String[] args) {
		new Test();
	}

	// method testing task 1
	public void testOne() {
		// test for constructor 1
		Bug b1 = new Bug();
		b1name = " ";
		b1name = b1.getName();
		System.out.println(b1name);
		System.out.println(b1.toString());
		System.out.println(b1.toText());

		// test for constructor 2
		Bug b2 = new Bug("Human", "Rosie", 'R', 10, 10, 100, 100);
		System.out.println(b2);
		System.out.println(b2.toText());
	}

	public void testTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		if (sc.hasNextInt()) {
			System.out.println("Scanner is reading");
		}

		int x = sc.nextInt();
		System.out.print("y ");
		int y = sc.nextInt();
		System.out.print("energy: ");
		int energy = sc.nextInt();

		Bug b3 = new Bug("Bertie", "Bee", 'B', x, y, energy, 100);
		System.out.println(b3.toText());
		sc.close();
	}

}
