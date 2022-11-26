package franek.spring.learning.sfgdi;

import franek.spring.learning.sfgdi.controllers.ConstructorInjectedController;
import franek.spring.learning.sfgdi.controllers.MyController;
import franek.spring.learning.sfgdi.controllers.PropertyInjectedController;
import franek.spring.learning.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("------ Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean(
				"propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(
				"setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");

		ConstructorInjectedController construcorInjectedController = (ConstructorInjectedController) ctx.getBean(
				"constructorInjectedController");

		System.out.println(construcorInjectedController.getGreeting());


	}

}
