package net.andyfoster.bugworld;

public class BugWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to BugWorld!");

		Bug b1 = new Bug();
		Bug b2 = new Bug("Barry", "Beetle", 'B', 100, 100, 23, 4);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}
