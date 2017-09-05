package com.gms.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/board")
public class BoardController {
	@RequestMapping("/write")
	public String write() {
		return"board/board_write";
	}
	@RequestMapping("/list")
	public String list() {
		return"board/board_list";
	}
	@RequestMapping("/detail")
	public String detail() {
		return"board/board_detail";
	}
	@RequestMapping("/delete")
	public String main() {
		return"board/board_delete";
	}
}
