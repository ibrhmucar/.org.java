package Week8;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	
	//	TestEnvironment testOne = new TestEnvironment();
		
	//	testOne.browser = new Browser("Chrome");
	//	testOne.os = new OS("Windows");
	//	System.out.println("My test environment for test one is : " + testOne.toString());
		
	//	TestEnvironment testTwo = new TestEnvironment();
		
       
	//	testTwo.browser = new Browser();
	//	testTwo.browser.setBrowserType("Safari");
		
	//	testTwo.os = new OS();
	//	testTwo.os.setOs("MacOS");
		
	//	System.out.println("My test environment for test two is : " + testTwo.toString());
		
		
		TestEnvironment test = new TestEnvironment();
		test.br = new Browser();
		test.os = new OS();
		
	    test.br.setBrowserType("aa");
	    test.os.setOs("Mac");
	    System.out.println(test.toString());
		
		
		
		
		
		
		
		
	}

}
