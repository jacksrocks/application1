package com.hk.Controller;

import java.util.List;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hk.Entity.Mobiles;
import com.hk.Service.Imobileservice;


@Controller
@RequestMapping("/mobiles")
public class mobilesmgmcontroller 
{
	@Autowired
	private Imobileservice mbserv;
	
	@GetMapping("/homect")
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping("/showdata")
	public String showdata(Map<String, Object>map)
	{
		List<Mobiles>list=mbserv.showallmobiles();
		map.put("mobiles", list);
		return "showing";	
	}
	
	@GetMapping("/addmobile")
	public String showform(@ModelAttribute("mobile")Mobiles mobiles)
	{
		return "showform";
	}
	
	@PostMapping("addmobile")
	public String postMethodName(RedirectAttributes attrs,
			                      @ModelAttribute("mobile")Mobiles mobiles) 
	{
		String msg=mbserv.addmobiles(mobiles);
		attrs.addFlashAttribute("resMsg",msg);
		return "redirect:showdata";
	}
	

}
