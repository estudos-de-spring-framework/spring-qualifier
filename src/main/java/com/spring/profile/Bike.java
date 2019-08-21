package com.spring.profile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bikeBean")
public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Inicando Bicicleta");
	}

	@Override
	public void stop() {
		System.out.println("Parando Bicicleta");
	}

}
