package kr.co.mbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mbc.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/svc/user")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
	
	@GetMapping("/main")
	public String main() {
		return "member/main";
	}
	
}
