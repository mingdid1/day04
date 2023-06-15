package switch_;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestClass05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int day;
		
		System.out.println("날짜 입력 : ");
		day = sc.nextInt();
		
		switch(day % 7) {
			case 1 : System.out.println("월요일");	break;
			case 2 : System.out.println("화요일");	break;
			case 3 : System.out.println("수요일");	break;
			case 4 : System.out.println("목요일");	break;
			case 5 : System.out.println("금요일");	break;
			case 6 : System.out.println("토요일");	break;
			case 0 : System.out.println("일요일");
		}
		
		
		System.out.println("============================");
		
		int up;
		String home= null, work= null;
		
		while (true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			up = sc.nextInt();

			switch(up) {
				case 1 : System.out.println("우리집 등록");
						 home = sc.next(); 
						 System.out.println("등록 성공");
						 break;
						
				case 2 : System.out.println("회사 등록");
						 work = sc.next();
						 System.out.println("등록 성공");
						 break;
						 
				case 3 : System.out.println("우리집 : " + home);
						 System.out.println("회사 : " + work);
			}
			
		}
		
		
	}
}
