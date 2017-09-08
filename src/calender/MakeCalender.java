package calender;

import java.util.Scanner;

public class MakeCalender {

	public static int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leapyearmaxdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean isleapyear(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int cal(int year, int month) {
		if (isleapyear(year)) {
			return leapyearmaxdays[month-1];
		}else {
			return maxdays[month-1];
		}
	}
	
	public static void printcal() {
		System.out.println("  일    월    화    수    목    금    토 ");
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		System.out.println("달력을 출력하는 프로그램입니다.");
		System.out.println("(프로그램 종료는 입력값에 0을 입력하세요)");
		
		while(true) {
		System.out.println("몇년도 달력을 출력할까요? : ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		System.out.println("확인하고 싶은 달수를 입력하세요 : ");
		Scanner scanners = new Scanner(System.in);
		int month = scanners.nextInt();
		
		System.out.println("1일은 무슨 요일 입니까? (월,화,수... 한글자만 입력) : ");
		Scanner scannerss = new Scanner(System.in);
		String week = scanners.next();
		
		if (month==0 || year==0) {
		    System.out.println("프로그램을 종료합니다.");
		    break;
        }
		
		if (month > 12 | month < 0) {
		    System.out.println("1에서 12까지의 숫자를 입력하시기 바랍니다.");
		    continue;
		}else {
			printcal();
			for (int i = 1; i<=cal(year, month); i++) {
				System.out.printf("%3d", i);

				if (i % 7 == 0) {
					System.out.printf("\n");
				}
		}
			System.out.println();
			System.out.println("-----------------------"+"\n");
		}
		
		}}}
