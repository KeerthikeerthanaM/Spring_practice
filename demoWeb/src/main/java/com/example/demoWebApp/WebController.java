package com.example.demoWebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("index") // this index denotes-->in google we type a request

	public String index() // this index is method name
	{
		return ("index.html"); // this index.html is a file in webapp
	}

	@RequestMapping("contactUs")
	public String contactUs() {
		return "contactUs.html";
	}


}
