package com.chary.bhaumik.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController 
{
	@RequestMapping("/second")
    public String demo()
	{
        return "Second Service";
    }
}
