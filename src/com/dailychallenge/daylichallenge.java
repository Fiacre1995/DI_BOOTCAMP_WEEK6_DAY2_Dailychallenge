package com.dailychallenge;

import java.util.Random;

public class daylichallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		int n = rand.nextInt(2);

		if (n == 1) {
			System.out.println("Pile");
		} else {
			System.out.println("Face");
		}

	}

}
