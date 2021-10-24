package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import automationFramework.SampleCase;

class SampleCaseTest {

	static SampleCase test = new SampleCase();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		test.initDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		test.closeWebDriver();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSampleCase() {
		test.startWebDriver();
		test.run();
	}

}
