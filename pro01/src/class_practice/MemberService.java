package class_practice;

public class MemberService {
	
	boolean login(String id, String password) {
		if(id == "hong") {
			if(password == "12345") {
				return true;
			}
		}
		return false;
		
	}

	public void logout(String id) {
		if(id == "hong") {
			System.out.println("로그아웃 되었습니다.");
		}
		
		
	}
}
