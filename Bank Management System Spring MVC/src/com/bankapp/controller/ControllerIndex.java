package com.bankapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndex {

	@RequestMapping("index")
	public String index()
	{
		return "index"; 
	}
	
}