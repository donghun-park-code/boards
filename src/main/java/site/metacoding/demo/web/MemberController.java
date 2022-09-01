package site.metacoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import site.metacoding.demo.domain.member.MemberDao;

@Controller
public class MemberController {
	
	private MemberDao memberDao;

	
	public MemberController(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	@GetMapping("/member/joinForm")
	public String JoinForm() {
		return "member/joinForm";
	}
	@PostMapping("/member/join")
	public String Join(String username, String password, String email) {
		Integer result = memberDao.insert(username, password, email);
		if(result == 1) {
			return "member/loginForm";
		}else {
			return "error/servererror";
		}
	}
}
