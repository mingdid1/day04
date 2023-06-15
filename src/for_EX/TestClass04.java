package for_EX;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {

		// 2조
		
//		1. 숫자를 입력받아 입력받은 숫자까지의 짝수를 차례대로 출력하는 프로그램
//		ex) 
//		숫자를 입력하세요
//		20
//		0 2 4 6 8 10 12 14 16 18 20 

		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		int num = sc.nextInt();
		
		for (int i= 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		
		
		System.out.println("=================================");
//		2. 1~50사이의 3의배수 출력한 후, 3의 배수의 개수를 구하여라.
//
//		3의 배수: 3
//		3의 배수: 6
//		3의 배수: 9
//		3의 배수: 12
//		3의 배수: 15
//		3의 배수: 18
//		.
//		.
//		.
//		====================
//		3의 배수의 개수: 16
		
		int sum = 0;
		
		for (int i= 1; i<= 50; i++) {
			if (i % 3 == 0) {
				System.out.println("3의 배수 : " + i);
				sum ++;
			}
		}
		System.out.println("===================");
		System.out.println("3의 배수의 개수 : " + sum);
		
		
		
		System.out.println("=================================");
//		3. 정수를 입력하여 입력한 정수를 1부터 9까지 곱해주도록 하세요
//		ex) 입력:3 --> 3x1=3...3x9=27
//		ex) 입력:11 --> 11x1=11...11x9=99
//		(값 입력 하고 곱셈이 끝나도 다른 정수를 입력 해서 곱셈이 반복되도록 하기)
		
		while(true) {
			
			System.out.println("입력>> ");
			int aa = sc.nextInt();
			
			for (int i = 1; i <= 9; i ++) {
				System.out.println(aa + "x" + i + " = " + aa*i);
			}			
			
		}
	

	
	}
}
