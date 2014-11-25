package com.istic.calculator.command;

public interface CommandInterface {
	
	/**
	 * Do the command code.
	 * @param a 1st value.
	 */
	public int execute(int a, int b);
}
