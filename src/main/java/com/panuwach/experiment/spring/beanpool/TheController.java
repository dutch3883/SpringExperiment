package com.panuwach.experiment.spring.beanpool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TheController {

	@Resource(name="200Wheel")
	Wheel alltheWheel;

	@GetMapping(name = "/getWheel")
	public int getValue(){
		alltheWheel.more();
		System.out.println(Thread.currentThread().getId());
		return alltheWheel.getNumber();
	}
}
