package for_EX;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		
		// 4조
		
//		✨ 1번 문제 
//		1부터 100까지의 숫자 중에서 3의 배수인 숫자를 모두 출력하는 프로그램을 작성하세요.
		
		for (int i = 1; i<= 100; i ++) {
			if (i%3 ==0) {
				System.out.println("3의 배수 : " + i);
			}
		}
		
		System.out.println("===============================");
//		✨ 2번 문제
//		n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//		입력 : 5
//		출력 : 15
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("n의 값");
		int n = sc.nextInt();
		
		for (int i=1; i<= n; i ++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("===============================");
//		✨ 3번 문제
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//		숫자를 입력하면 숫자만큼 점점 증가하는 별 찍기
		
//		입력 : 5
//		출력 :
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 1; i <= 5; i ++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
		
	}
}
