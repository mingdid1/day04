package for_EX;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		
		// 3조

//		문제 1.		
// 		1 ~ 입력받은 수 까지의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("수 입력 >>> ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("num = " + i);
			sum += i;
			System.out.println("sum = " + sum);
			System.out.println("-------------");
		}	
		
		
		
		System.out.println("===============================");
//		문제 2.
//		구구단
//		2단부터 9단까지의 구구단
		
		for (int i = 2; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+ "x" + j+ "= " + i*j);
			}
		}
		
		
		
		System.out.println("===============================");
//		문제 3.		
//		식량창고에 2마리의 생쥐가 있는데 매 7일이 지나면 생쥐의 마릿수는 2배가 된다.
//		식량창고에는 1000kg(1000 * 1000g)의 식량이 있는데 1마리당 1일 100g씩 먹는다.
//		식량창고에 있는 식량이 떨어지면 생쥐는 몇마리인지, 몇일에 식량이 떨어지는지 출력하시오.
		
		int mouse = 200, day = 1;
		
		for (int i = 1000000; i >= 0; i -= mouse) {
			if (day % 7 == 0) {
				mouse *= 2;
			}
			day ++;
		}
		mouse /= 100;
		System.out.println("day : " + day + "생쥐 : " + mouse);

		
		
		
		
		System.out.println("===============================");
//		문제 4.
//		음료 자판기에 아래의 기능을 구현 하시오
//		1. 입금(추가 입금 시 누적)
//		2. 구입(음료 선택 시 "음료이름+가 나왔습니다"출력하고 남은 금액 출력)
//			1. 커피(2500원)
//			2. 코코아(2000원)
//			3. 아이스티(1500원)
//		(음료가격보다 금액이 적을 때 "금액이 부족합니다." 출력)
//		3. 현재 금액 확인
//		4. 잔돈 반환(잔돈을 반환하고 금액을 0로 만듬)
//		5. 종료
//		(잘못 입력 시 "다시 입력" 출력)
		
		int menu, put;
		int mon = 0, drink_m =0, all =0;
		String drink = null;
		
		
		while(true) {
			System.out.println("1. 입금");
			System.out.println("2. 음료구매");
			System.out.println("3. 현재 금액 확인");
			System.out.println("4. 잔돈 반환");
			System.out.println("5. 종료");
			put = sc.nextInt();
			
			switch(put) {
				case 1: System.out.print("입금 금액 >> ");
						mon = sc.nextInt();
						all += mon;
						break;
				case 2: 
					System.out.print("menu >> ");
					menu = sc.nextInt();
					
					if(menu == 1) {
						drink = "커피";
						drink_m =2500;
					}else if (menu ==2) {
						drink = "코코아";
						drink_m =2500;
					}else if (menu == 3) {
							drink = "아이스티";
							drink_m =1500;
					}
										
					if (drink_m < all) {
						System.out.println(drink + "가 나왔습니다");
						all -= drink_m;
					}else {
						System.out.println("금액이 부족합니다");
					}
					break;
				
				case 3: System.out.println("현재 금액 >> " + all);
						break;
				
				case 4: System.out.println("잔돈 반환..  " + all);
						all = 0;
						break;
						
				case 5: System.out.println("종료..");
						break;
						
				default : System.out.println("잘못입력하셨습니다");
			}
			
		}

	
	}

}
