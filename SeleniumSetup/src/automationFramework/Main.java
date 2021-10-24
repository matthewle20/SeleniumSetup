package automationFramework;

public class Main {

	public static void main(String[] args) {
		SampleCase test = new SampleCase();
		test.initDriver();
		test.startWebDriver();
		test.run();
		test.closeWebDriver();
	}

}
