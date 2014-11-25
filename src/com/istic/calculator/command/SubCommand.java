package com.istic.calculator.command;

public class SubCommand implements CommandInterface{

	@Override
	public int execute(int a, int b) {
		return a - b;
	}

}
