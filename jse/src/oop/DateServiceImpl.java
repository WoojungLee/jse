package oop;

import java.util.Scanner;

public class DateServiceImpl implements DateService {

	@Override
	public String getEndDateOfMonth(int month) {
		// TODO Auto-generated method stub
		String EndDate = "";
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			EndDate = "31일 입니다.";
			break;
		case 4: case 6: case 9: case 11:
			EndDate = "30일 입니다.";
			break;
		case 2:
			EndDate = "29일 입니다.";
			break;
		default:
			EndDate = "숫자를 잘못 입력하셨습니다.";
			break;
		}
		return EndDate;
	}

}
