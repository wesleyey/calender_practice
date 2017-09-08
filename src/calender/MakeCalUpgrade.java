package calender;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeCalUpgrade {

		public static int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		public static int[] leapyearmaxdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		public static String[] firstday = {"일", "월", "화", "수", "목", "금", "토"};
		
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
			}}
			
		
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
			
			if (month==0 || year==0) {
			    System.out.println("프로그램을 종료합니다.");
			    break;
	        }
			
			if (month > 12 | month < 0) {
			    System.out.println("1에서 12까지의 숫자를 입력하시기 바랍니다.");
			    continue;
			}else {
				System.out.println("  <"+year+"년"+month+"월 달력입니다.>");
				printcal();
				ArrayList<String> calender = new ArrayList<String>();
				int firstweek = 0;
				int days = ((year-1)*365 + (((year-1)/4) - ((year-1)/100) + ((year-1)/400)));
				
                if (month<2) {
                	firstweek = days % 7;
                } else if (month>=2 && isleapyear(year) == true) {
                	for (int m = 0; m <= month-2; m++) {
                		days = days + leapyearmaxdays[m];
                	}
                	firstweek = days % 7;
                } else if (month>=2 && isleapyear(year) == false) {
                	for (int m = 0; m <= month-2; m++) {
                		days = days + maxdays[m];
                	}
                	firstweek = days % 7;
                }
                
				if (firstweek <= 5) {
					firstweek = firstweek + 1;
				} else {
					firstweek = firstweek - 6;
				}
				
                for (int k = 0; k < firstweek; k++) {
					calender.add(k, " ");
				}
					
				for (int i = 1; i<=cal(year, month); i++) {
					calender.add(firstweek-1+i,String.valueOf(i));
				}
					
				for (int l = 0; l<calender.size(); l++) {
					System.out.printf("%3s",calender.get(l));

					if ((l+1) % 7 == 0) {
						System.out.printf("\n");
					}
				}
				//System.out.println(calender);
				System.out.println();
				System.out.println("-----------------------"+"\n");
			}
			}
			}
		}