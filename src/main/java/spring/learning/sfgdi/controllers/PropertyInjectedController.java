package spring.learning.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.learning.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
