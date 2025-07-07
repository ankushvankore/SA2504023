package com.Assignments;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		int i = rnd.nextInt(6);	
		//Will generate any random value in the range of 0 to 5
		System.out.println(i);
	}

}
