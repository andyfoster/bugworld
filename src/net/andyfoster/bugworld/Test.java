package net.andyfoster.bugworld;

public class Test {

	private String b1name;
	private String b2name;

	// the constructor test is used to call
	public Test() {
		this.testOne();

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

}
