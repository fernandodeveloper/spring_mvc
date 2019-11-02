package spring_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("form")
public class FormController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
