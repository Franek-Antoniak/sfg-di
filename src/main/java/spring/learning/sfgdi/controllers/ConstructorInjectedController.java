package spring.learning.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.learning.sfgdi.services.GreetingService;


@Controller

public class ConstructorInjectedController {
	private final GreetingService greetingService;

	public ConstructorInjectedController(
			@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
