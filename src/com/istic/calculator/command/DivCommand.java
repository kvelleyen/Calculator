package com.istic.calculator.command;

public class DivCommand implements CommandInterface{

	@Override
	public int execute(int a, int b) {
		if(b != 0){
			return a / b;
		}else{
			return -1;
		}
	}

}
