package com.spring.profile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringQualiferApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  (ApplicationContext) SpringApplication.run(SpringQualiferApplication.class, args);
		VehicleComponent component =  (VehicleComponent) ctx.getBean("vehicleComponent");
		component.service();
	}

}
