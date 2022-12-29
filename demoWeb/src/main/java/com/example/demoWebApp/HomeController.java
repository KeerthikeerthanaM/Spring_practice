package com.example.demoWebApp;


import javax.servlet.http.HttpSession;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@org.springframework.stereotype.Controller
public class HomeController {

	
//	@RequestMapping("home")
//	public String home(HttpServletRequest req)
//	{
//		HttpSession session=req.getSession();
//		String s=req.getParameter("name");
//		
//		session.setAttribute("username", s);
//		return("home");
//	}
	
//	@RequestMapping("home")
//	public String home(String name,HttpSession session)
//	{
//	    session.setAttribute("username", name);     //model
//		return("NewFile");                          //view
//    }
//	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("uname") String login,HttpSession session)
//	{
//		
//		ModelAndView mv=new ModelAndView();        //using model and view class
//		mv.addObject("username", login);
//		mv.setViewName("NewFile");
//		
//		session.setAttribute("username",login);            //uname-have to type in http 
//		//return "NewFile";
//		return mv;
//	}
//	
	@RequestMapping("home")
	public ModelAndView home(UserDetails ud)
	{
		
		ModelAndView mv=new ModelAndView();        //using model and view class
		mv.addObject("details", ud);
		mv.setViewName("NewFile");
		
		return mv;
	}
	


	
}


