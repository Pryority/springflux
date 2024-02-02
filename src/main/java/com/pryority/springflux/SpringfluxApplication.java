package com.pryority.springflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.pryority.springflux.Greeting.GreetingClient;

@SpringBootApplication
@ComponentScan(basePackages = "com.pryority.springflux")
public class SpringfluxApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringfluxApplication.class, args);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
