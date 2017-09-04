package calender;

import java.util.Scanner;

public class PlusTwoNumbers {

	public static void main(String[] args) {
		System.out.println("두개의 숫자를 입력하세요 (ex:숫자 숫자)");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		 
		String[] splitedvalue = inputValue.split(" ");
		int a = Integer.parseInt(splitedvalue[0]);
		int b = Integer.parseInt(splitedvalue[1]);
        int result =a + b;
		
		System.out.println(a+"+"+b+"="+result);
	}

}
