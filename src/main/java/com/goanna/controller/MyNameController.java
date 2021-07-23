package com.goanna.controller;

import com.goanna.entity.MyName;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public MyName greeting(@RequestParam(value = "name", defaultValue = "Nathan") String name) {
		return new MyName(counter.incrementAndGet(), String.format(template, name));
	}
}
