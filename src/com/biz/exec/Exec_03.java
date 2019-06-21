package com.biz.exec;

import java.util.Random;

public class Exec_03 {

	public static void main(String[] args) {

		Random rnd=new Random();
		int intNum=rnd.nextInt(100)+1;
		
		if(intNum%2==0) System.out.println(intNum+"는 짝수입니다"); 
		else System.out.println(intNum+"는 홀수입니다");
		
	}
}
