package com.chary.bhaumik.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController
{
	@RequestMapping("/")
    public String demo()
	{
        return "First Service";
    }

}
