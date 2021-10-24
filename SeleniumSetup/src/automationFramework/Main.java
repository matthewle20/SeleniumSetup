package automationFramework;

public class Main {

	public static void main(String[] args) {
		SampleCase test = new SampleCase();
		test.initDriver();
		test.setURL("http://www.google.com");
		test.startWebDriver();
		test.closeWebDriver();
	}

}
