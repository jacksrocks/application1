package com.hk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home 
{
	@GetMapping("/")
	public String home()
	{
		return "redirect:mobiles/homect";
		
	}

}
