package calender;

import java.util.Scanner;

public class Calender {
	
	public static int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
		System.out.println(" 일    월    화    수    목    금    토 ");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("---------------------"+"\n");
		
		while(true) {
		System.out.println("확인하고 싶은 달수를 입력하세요 : ");
		System.out.println("(프로그램 종료는 입력값에 0을 입력하세요)");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a==0) {
		    System.out.println("프로그램을 종료합니다.");
		    break;
        }
		
		if (a > 12 | a < 0) {
		    System.out.println("1에서 12까지의 숫자를 입력하시기 바랍니다.");
		    continue;
		}else {
			System.out.println(a+"월의 최대일수는"+maxdays[a-1]+"입니다.");
		}
		}}}
			
		/*
	    }else {
		    if (a==1 | a==3 | a==9 | a==5 | a==7 | a==8 | a==10 | a==12) {
		        System.out.println(a+"월의 최대일수는 31일 입니다.");
		        continue;
		}else {
			if (a==4 | a==6 | a==9 | a==11) {
			    System.out.println(a+"월의 최대일수는 30일 입니다.");
			    continue;
		}else {
			if (a==2) {
			    System.out.println(a+"월의 최대일수는 28일 입니다.");
			    continue;
	    }else {
			if (a==0) {
			    System.out.println("프로그램을 종료합니다.");
			    break;
        }
        */