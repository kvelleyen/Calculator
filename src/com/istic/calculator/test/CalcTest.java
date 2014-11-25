package com.istic.calculator.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.istic.calculator.command.AddCommand;
import com.istic.calculator.command.CommandInterface;
import com.istic.calculator.command.DivCommand;
import com.istic.calculator.command.MultiCommand;
import com.istic.calculator.command.SubCommand;

public class CalcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void additionPos() {
		int a = 2;
		int b = 3;
		int c = 5;
		
		CommandInterface cmd = new AddCommand();
		
		int d = cmd.execute(a, b);
		
		assertEquals(c, d);
	}
	
	@Test
	public void additionNeg() {
		int a = -2;
		int b = -3;
		int c = -5;
		
		CommandInterface cmd = new AddCommand();
		
		int d = cmd.execute(a, b);
		
		assertEquals(c, d);
	}
	
	@Test
	public void subPos() {
		int a = 2;
		int b = 3;
		int c = -1;
		
		CommandInterface cmd = new SubCommand();
		
		int d = cmd.execute(a, b);
		
		assertEquals(c, d);
	}
	
	@Test
	public void subNeg() {
		int a = -2;
		int b = -3;
		int c = 1;
		
		CommandInterface cmd = new SubCommand();
		
		int d = cmd.execute(a, b);
		
		assertEquals(c, d);
	}
	
	@Test
	public void multiPos() {
		int a = 2;
		int b = 3;
		int c = 6;
		
		CommandInterface cmd = new MultiCommand();
		
		int d = cmd.execute(a, b);
		
		assertEquals(c, d);
	}
	
	@Test
	public void multiNeg() {
		int a = -2;
		int b = -3;
		int c = 6;
		
		CommandInterface cmd = new MultiCommand();
		
		int d = cmd.execute(a, b);
		
		assertEquals(c, d);
	}
	
	@Test
	public void zeroValue() {
		int a = 2;
		int b = 0;
		int c = -1;
		
		CommandInterface cmd = new DivCommand();
		
		int d = cmd.execute(a, b);
		
		assertEquals(c, d);
	}
	
}
