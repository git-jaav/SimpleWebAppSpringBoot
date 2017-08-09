package pe.jaav.sistemas.SimpleWebAppSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public  String  helloSimpleWebbApp(){
		return "hello";
	}
}
