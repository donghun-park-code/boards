package site.metacoding.demo.domain.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {

	public Integer insert(String username, String password, String email) {
		System.out.println("Insert 되었습니다.");
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		return 1;
	}
	public Integer update(Integer id, String password) {
		System.out.println("업데이트 되었습니다.");
		System.out.println(id);
		System.out.println(password);
		return 1;

	}
	
	public Integer deleteByid(Integer id) {
		System.out.println("삭제 되었습니다.");
		System.out.println(id);
		return 1;

	}
	public Member findByid(Integer id) {
		
		Member m1 = new Member(1, "sopu55555","aqw2der4gt!","sopu55555@naver.com");
		Member m2 = new Member(2, "ojm4348", "dhwjdals4348!","sopu55544@gmail.com");
		Member m3 = new Member(3, "kim1154", "kim2222","sopu5@naver.com");
		
		if(id==1) {
			return m1;
		}else if(id==2) {
			return m2;
		}else if(id==3) {
			return m3;
		}
		else {
			return null;
		}
	}
	public List<Member> findAll() {
		
		Member m1 = new Member(1, "sopu55555","aqw2der4gt!","sopu55555@naver.com");
		Member m2 = new Member(2, "ojm4348", "dhwjdals4348!","sopu55544@gmail.com");
		Member m3 = new Member(3, "kim1154", "kim2222","sopu5@naver.com");
		
		List<Member> memberList = new ArrayList<>();
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		return memberList;
	}
}
