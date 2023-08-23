package net.andyfoster.bugworld;

import java.util.ArrayList;
import java.util.List;

public class BugWorld {

    public static void main(String[] args) {
        System.out.println("Welcome to BugWorld!");

        World w = new World();
        w.drawWorld();

        Bug b1 = new Bug();
        Bug b2 = new Bug("Barry", "Beetle", 'B', 100, 100, 23, 4);

//		System.out.println(b1.toString());
//		System.out.println(b2.toString());
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("x: ");
//		int x = sc.nextInt();
//		System.out.print("y ");
//		int y = sc.nextInt();
//		System.out.print("energy: ");
//		int energy = sc.nextInt();

//		Bug b3 = new Bug("Bertie", "Bee", 'B', x, y, energy, 100);

        Spider b4 = new Spider();
        b4.setName("Sam");

//		System.out.println(b3.toText());

        List<Bug> bugs = new ArrayList<>();

        bugs.add(b1);
        bugs.add(b2);
//		bugs.add(b3);
        bugs.add(b4);

        for (Bug b : bugs) {
//			System.out.println(b.toText());
        }

        b1.move("N");
        b1.move("N", 5);

//		System.out.println(b1.toText());

    }
}
