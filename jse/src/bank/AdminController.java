package bank;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		AdminService adminService = new AdminServiceImpl();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("업무선택 :\n 1.전체 계좌 수 조회\n 2.계좌번호로 조회\n 3.이름으로 조회\n 4.계좌삭제\n 5.동일인 계좌수 조회\n 6.종료");
			switch (scanner.nextInt()) {
			case 1:
				adminService.countAll();
				break;
			case 2:
				adminService.searchAccountByAccountNo(scanner.nextInt());
				break;
			case 3:
				adminService.searchAccountByName(scanner.next());
				break;
			case 4:
				adminService.closeAccount(scanner.nextInt());
				break;
			case 5:
				adminService.searchCountByName(scanner.next());
				break;
			case 6:
				return;
			default:
				System.out.println("1~5번 사이에서 선택 가능합니다.");
				break;
			}
		}
	}
}
