package com.gms.web.grade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grade")
public class GradeController {
	@RequestMapping("/add")
	public String add() {
		return"grade/grade_add";
	}
	@RequestMapping("/list")
	public String list() {
		return"grade/grade_list";
	}
	@RequestMapping("/detail")
	public String detail() {
		return"grade/grade_detail";
	}
	@RequestMapping("/delete")
	public String delete() {
		return"grade/grade_delete";
	}
}
