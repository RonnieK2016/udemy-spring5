package com.udemy.spring.didemo;

import com.udemy.spring.didemo.controllers.ConstructorInjectionController;
import com.udemy.spring.didemo.controllers.MyController;
import com.udemy.spring.didemo.controllers.PropertyInjectionController;
import com.udemy.spring.didemo.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("HelloWorldController");
		controller.sayHello();

		System.out.println(context.getBean(PropertyInjectionController.class).say());
		System.out.println(context.getBean(ConstructorInjectionController.class).say());
		System.out.println(context.getBean(SetterInjectionController.class).say());
	}

}
