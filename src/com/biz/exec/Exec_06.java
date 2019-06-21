package com.biz.exec;

import java.util.Scanner;

public class Exec_06 {

	public static void main(String[] args) {

		/*
		 * 키보드에서 문자열을 입력받아서
		 * 콘솔에 표시하시오
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("문자를 입력하시오");
		String strName=scan.nextLine();
		System.out.println(strName);
		
		
	}

}
