package co.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.soft.beans.UserJoin;
import co.soft.service.UserInfoService;

@Controller
public class UserController {
	
	@Autowired
	private UserInfoService uService;
	
	@RequestMapping(value = "/join",method=RequestMethod.POST)
	public String join(@ModelAttribute("userJoin") UserJoin bean) {
		uService.userJoin(bean);
		return "join";
	}
	
}
