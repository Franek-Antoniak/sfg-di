package franek.spring.learning.sfgdi.controllers;

import franek.spring.learning.sfgdi.services.GreetingService;

public class SetterInjectedController {

	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
