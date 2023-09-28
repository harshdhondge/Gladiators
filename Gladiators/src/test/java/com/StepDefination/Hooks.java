package com.StepDefination;

import com.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public static void setup() {
		HelperClass.setUpdriver();
	}
	@After
	public static void tearDown(Scenario scenario) {
		HelperClass.tearDown();
	}
}
