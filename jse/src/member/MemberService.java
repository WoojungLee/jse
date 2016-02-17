package member;

public interface MemberService {
	public String login(String id, String password);
	public String update(MemberBean member);
	public String join(MemberBean member);
	public MemberBean searchById(String id);
	public MemberBean[] searchByName(String name);
	public String remove(String userid);
	public int countAll();
	public int searchCountByName(String name);
}
