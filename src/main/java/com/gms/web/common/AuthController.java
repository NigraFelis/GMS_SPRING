package com.gms.web.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping("/login_view")
	public String goLogin() {
		//logger.info("AuthController Enter");
		return "common/login";
	}
	@RequestMapping("/main")
	public String login() {
		return"common/main";
	}
	@RequestMapping("/logout")
	public String main() {
		return"common/login";
	}
}
