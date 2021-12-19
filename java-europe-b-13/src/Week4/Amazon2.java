package Week4;

public class Amazon2 {

	public static void main(String[] args) {

		System.out.println("--Starting Amazon Search Functional Test--");
		AmazonTest.openBrowser();
		AmazonTest.navigateToAmazonPage();
		AmazonTest.searchForAnItem();
		AmazonTest.searchForAnItem("Java");
		AmazonTest.verifyResultsAreDisplayed();
		System.out.println("Amazon Search Functional Test compeleted-PASS-");
		System.out.println("--------------------------------");
		
		
		
	
	}
	

}
