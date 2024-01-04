package com.myproject01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	
	Calc c;
	//setup method is responsible to initialize the resources
	@Before
	public void setUp() throws Exception {
		c=new Calc(); 
	}
	//tear down method is responsible to release the resources
	@After
	public void tearDown() throws Exception {
		c=null;
	}

	//Its a test case
	@Test
	public void testAddition() {
		int result=c.addition(5, 7);
		
		assert result>6: "value should be greater than 6"; 
	
	}
//
	@Test
	public void testSubtraction() {
		int result=c.subtraction(5, 7);
		
		assert result<6: "value should be greater than 6"; 
	}

	@Test
	public void testMultiplication() {
		int result=c.multiplication(5, 7);
		
		assert result>6: "value should be greater than 6"; 
	}

	@Test
	public void testDivision() {
		int result=c.division(5, 7);
		
		assert result<6: "value should be greater than 6"; 
	}

}
