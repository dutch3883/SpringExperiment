package com.panuwach.experiment.spring.beanpool;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WheelConfig {


	@Bean(name = "200Wheel")
	public Wheel createWheel(){
		return new Wheel(200);
	}


	@Bean(name = "noWheel")
	public Wheel createNoWheel(){
		return null;
	}
}
