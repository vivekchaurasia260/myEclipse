package com.vivekjpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a = 37;
		int b = 89;
		int c = 17;
		int d = 77;
		return "This is just testing sum of a and b is " + (a+b+c-d);
	}

}
