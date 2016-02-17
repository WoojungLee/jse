package member;

public class MemberServiceImpl implements MemberService {
	private int count = 0;
	MemberBean[] members;

	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
		members = new MemberBean[100];
	}

	@Override
	public String login(String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(MemberBean member) {
		// TODO Auto-generated method stub
		for (int i = 0; i < members.length; i++) {
			members[i].setName(member.getName());
			members[i].setUserid(member.getUserid());
			members[i].setPassword(member.getPassword());
			members[i].setAddr(member.getAddr());
			members[i].setBirth(member.getBirth());
		}
		return null;
	}


	public int getCount() {
		return count;
	}

	@Override
	public String join(MemberBean member) {
		// 회원가입
		members[count] = member;
		count++;
		return "회원가입이 완료되었습니다.";
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보 검색
		MemberBean result = new MemberBean();
		for (int i = 0; i < this.getCount(); i++) {

			if (members[i].getName().equals(id)) {
				result = members[i];
			}
		}
		return result;

	}

	@Override
	public MemberBean[] searchByName(String name) {
		// 이름으로 회원정보 검색
		MemberBean[] tempList = new MemberBean[this.searchCountByName(name)];
		int j = 0;
		for (int i = 0; i < this.getCount(); i++) {

			if (members[i].getName().equals(name)) {
				tempList[j] = members[i];
				j++;
			}
		}
		return tempList;
	}

	@Override
	public String remove(String userid) {
		// 회원탈퇴
		// AccountBean account = null;
		String closeResult = "";
		// 이 라인에서 account 는 인스턴스 개념이 아니라
		// 리턴을 받는 타입의 변수이다.
		if (this.searchById(userid) != null) {
			for (int i = 0; i < this.getCount(); i++) {
				if (members[i].getUserid() == userid) {
					members[i] = members[this.getCount() - 1];
					members[this.getCount() - 1] = null;
				}
			}
			count--;
			closeResult = userid + " 계정이 정상적으로 삭제되었습니다.";
		} else {
			closeResult = "해당 아이디가 존재하지 않습니다.";
		}
		return closeResult;
	}

	@Override
	public int countAll() {
		// 전체 회원 수 조회
		return this.getCount();
	}

	@Override
	public int searchCountByName(String name) {
		// 동명이인 수 검색
		// TODO Auto-generated method stub
		int tempCount = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (members[i].getName().equals(name)) {
				tempCount++;
			}
		}
		return tempCount;
	}
}
