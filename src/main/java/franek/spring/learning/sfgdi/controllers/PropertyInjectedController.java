package franek.spring.learning.sfgdi.controllers;

import franek.spring.learning.sfgdi.services.GreetingService;


public class PropertyInjectedController {

	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
