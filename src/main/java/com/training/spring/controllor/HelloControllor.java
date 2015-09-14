package com.training.spring.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloControllor {

	@RequestMapping(value = "/hello", method = { RequestMethod.GET })
	public String helloPage() {
		return "simple/hello";
	}
	
	@RequestMapping(value = "/hello", method = { RequestMethod.POST })
	public String helloParam2(@RequestParam(value="name") String name, Model model) {
		model.addAttribute("name", name);
		return "simple/welcome";
	}
	
	//@PathVariable ใช้กำหนดตัวแปรที่อยู่ใน URL
	@RequestMapping(value = "/hello/{name}", method = { RequestMethod.GET})
	public String helloPath(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "simple/welcome";
	}
}
