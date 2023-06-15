package for_EX;

import java.util.Scanner;

public class TestClass05 {
	public static void main(String[] args) {
		
		// 5조

//		1번.		
//		1부터 30까지 수에서 4의 배수와 3의 배수를 찾기 겹치는 배수는 겹치는 수라고 표현하기
		
		for (int i = 1; i <= 30; i ++) {
			if (i % 12 == 0) {
				System.out.println("겹치는 수 : " + i);
			}else if (i% 3 == 0) {
				System.out.println("3의 배수 : " + i);
			}else if (i% 4 == 0) {
				System.out.println("4의 배수 : " + i);
			}
			
			
		}
		
		
		
//		2번.
//		두 정수를 입력하여 두 정수 사이의 합을 구하고 각 홀짝의 합을 구하고 비교하시오.		   

//		Ex)
//		두 정수 입력 >> 10 2
//		2~10의 합 : 54
//		짝수의 합 : 30
//		홀수의 합 : 24
//		짝수의 합이 더 큽니다.
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		int even = 0, odd = 0;
		
		System.out.println("두개의 정수 입력>> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			for (int i = n2 ; i <= n1; i++) {
				if (i %2 == 0) {
					even += i;
				}else {
					odd += i;
				}
			}
		}else if (n2 > n1){
			for (int i =n1 ; i <= n2; i++) {
				if (i %2 == 0) {
					even += i;
				}else {
					odd += i;
				}
			}
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
		String result = even > odd ? "짝수의 합이 더 큽니다": "홀수의 합이 더 큽니다";
		System.out.println(result);
		
//		3번.
//		수 두개를 입력받고 각각 홀수인지 짝수인지 구분후 두개를 더하여 출력하세요.
			
		int n3, n4;
		
		System.out.println("두수 입력>>> ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		String result1, result2;
		result1 = (n3 % 2 == 0) ? "짝수" : "홀수"; 
		result2 = (n4 % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(n3 + " : " + result1);
		System.out.println(n4 + " : " + result2);
		System.out.println("두 수의 합: " + (n3 + n4));
	}
}
