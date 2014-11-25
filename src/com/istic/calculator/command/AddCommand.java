package com.istic.calculator.command;

/**
 * Design pattern command for Add.<br>
 * jiofzedkos @see DivCommand
 * @author velleyen
 *
 */
public class AddCommand implements CommandInterface{
	
	@Override
	public int execute(int a, int b) {
		return a + b;
	}
}
