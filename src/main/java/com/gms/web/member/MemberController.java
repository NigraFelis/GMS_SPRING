package com.gms.web.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/add")
	public String add() {
		return"member/member_add";
	}
	@RequestMapping("/list")
	public String list() {
		return"member/member_list";
	}
	@RequestMapping("/detail")
	public String detail() {
		return"member/member_detail";
	}
	@RequestMapping("/delete")
	public String delete() {
		return"member/member_delete";
	}

}
