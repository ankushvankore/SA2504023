package com.WebDriverDemos;

interface X {
	void colour();
}

interface Y {
	void model();
}

class Car implements X, Y {
	public void colour() {
		System.out.println("interface X");
	}

	public void model() {
		System.out.println("interface Y");
	}

	

	public static void main(String[] args) {
	}
}
class Car1 implements X, Y {

	public void colour() {
		System.out.println("The colour id red");

	}

	public void model() {
		System.out.println("It is 2025 model");
	}
}

public class Inheritance {
	public static void main(String[] args) {

		Car1 e = new Car1();
		e.colour();
		e.model();
		Car d = new Car();
		d.model();
		d.colour();
	}
}
