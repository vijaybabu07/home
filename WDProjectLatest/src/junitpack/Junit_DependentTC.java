package junitpack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_DependentTC {
	@BeforeClass
	public static void a(){
		System.out.println("This is before class");
	}
	@AfterClass
	public static void b(){
		System.out.println("This is after class");
	}
	@Test
	public void t1(){
		System.out.println("Test1");
	}
	@Test
	public void t2(){
		System.out.println("Test2");
	}
	@Test
	public void t3(){
		System.out.println("Test3");
	}
	@Ignore
	@Test
	public void t4(){
		System.out.println("Test4");
	}
	@Test
	public void t5(){
		System.out.println("Test5");
	}

}
