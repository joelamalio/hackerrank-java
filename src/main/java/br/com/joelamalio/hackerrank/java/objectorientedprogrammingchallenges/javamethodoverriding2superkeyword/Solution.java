package br.com.joelamalio.hackerrank.java.objectorientedprogrammingchallenges.javamethodoverriding2superkeyword;

public class Solution {
	public static void main(String[] args) {
		MotorCycle M = new MotorCycle();
	}
}

class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());

		String temp = super.define_me();

		System.out.println("My ancestor is a cycle who is " + temp);
	}

}