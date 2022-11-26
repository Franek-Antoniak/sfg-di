package spring.learning.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.learning.sfgdi.services.PrimaryGreetingService;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();

		controller.greetingService = new PrimaryGreetingService();
	}

	@Test
	void getGreeting() {

		System.out.println(controller.getGreeting());
	}
}