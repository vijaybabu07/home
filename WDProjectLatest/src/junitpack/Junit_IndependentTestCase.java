package junitpack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_IndependentTestCase {

	@Before
	public void a(){
		System.out.println("This is Before");
	}
	@After
	public void b(){
		System.out.println("This is After");
	}
	@Test
	public void t1(){
		System.out.println("This is Test1");
	}
	@Test
	public void t2(){
		System.out.println("This is Test2");
	}
	@Test
	public void t3(){
		System.out.println("This is Test3");
	}
}
