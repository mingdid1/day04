package for_EX;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {

		// 1조
		
//		#1
//		월 입력받고 그에 해당하는 계절 출력하기 (if문 과 switch문 이용)
//		ex) 1월 --> 겨울/ 3월 --> 봄/ 7월 --> 여름 /10월 --> 가을
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력>> ");
		int n1 = sc.nextInt();
		
		int n2 = 0;
		String str = null;
		
		if (n1 >= 1 && n1 <= 12) {
			if (n1 >= 10) {
				n2 = 4;
			}else if (n1 >= 7) {
				n2 = 3;
			}else if (n1 >= 3) {
				n2 = 2;
			}else if (n1 >= 1) {
				n2 = 1;
			}
		}
		
		switch (n2) {
			case 1 : str = "봄";		break;
			case 2 : str = "여름";	break;
			case 3 : str = "가을";	break;
			case 4 : str = "겨울";	
		}
		System.out.println(str);
		
		
		
		
		System.out.println("===========================");
//		#2
//		출생월을 입력받아 계절 출력하기 (for, if문 사용)
//		3~5:봄, 6~8:여름 9~11:가을 12~2:겨울
//		자신의 출생월 입력 -> 계절 출력
//		ex)
//		출생월 입력: 12
//		겨울
		
		System.out.println("출생월>> ");
		int num = sc.nextInt();
		
		
		for (int i = 1; i <= 12; i++) {
			if (num == i) {
				if (num <= 5 && num >= 3) {
					str = "봄";
				}else if (num == 12 || num == 1 || num == 2) {
					str = "겨울";
				}else if (num <= 8) {
					str = "여름";
				}else if (num <= 11) {
					str = "가을";
				}
			}
		}
		System.out.println(str);
		
		
		
		
		System.out.println("===========================");
//		#3
//		출력 값의 짝수 , 홀수를 구분해서 나온 짝수끼리 합과 홀수끼리의 합을 출력하시오.
		
		System.out.print("입력값 >>> ");
		int input = sc.nextInt();
		
		int even =0, odd =0;
		
		for(int i = 0; i <= input; i++) {
			if (i % 2 == 0) {
				even += i; 
			}else {
				odd += i;
			}
		}System.out.println("짝 : " + even + ", 홀 : " + odd);
		
		
		
		
		System.out.println("===========================");
//		#4
//		사용자에게 명령어를 입력받아 처리하는 프로그램을 작성하세요.
//		"count" 명령어는 입력할 학생의 수를 입력받습니다.
//		         > 학생 수를 입력 받지 않고 아래 명령어를 입력하는 경우 "학생 수를 입력하세요"를 출력한 후 메인 메뉴로 돌아옵니다.
//		"member" 명령어는 사용자의 이름과 주소를 입력받은 후 메인 메뉴로 돌아옵니다.
//		"grade" 명령어는 사용자의 국어, 수학, 영어 성적을 차례대로 입력 받은 후 메인 메뉴로 돌아옵니다.
//		"print" 명령어는 입력 받은 정보를 아래와 같이 출력한 후 메인 메뉴로 돌아옵니다. 메인 메뉴를 돌아온 후에는 학생의 수를 다시 입력 받아야하며,
//				다른 명령어 입력 시 "학생 수를 입력하세요"를 출력합니다.
//		         이름 : ㅇㅇㅇ
//		         주소 : ㅇㅇㅇ
//		         국어 : ㅇㅇㅇ
//		         수학 : ㅇㅇㅇ
//		         영어 : ㅇㅇㅇ
//		         총점 : ㅇㅇㅇ
//		         평균 : ㅇㅇㅇ \n
//		"exit" 명령어를 입력할 경우 프로그램을 종료합니다.

//		단, 변수는 아래의 변수만 사용합니다.
//		         Scanner 변수
//		         명령어 저장 변수 cmd (기본값 : "")
//		         학생 수 저장 변수 cnt (기본값 : -1)
//		         학생 정보 저장 변수 String[][] student (기본값 : {})
//		         성적 저장 변수 int[][] grade (기본값 : {})
//		         LCV 변수 boolean flag (기본값 : true)
//		while 한 번, switch 한 번, for 세 번, if 세 번만 사용하면 됩니다.
		
        String cmd = "";
        int cnt = -1;
        String[][] student = {};
        int[][] grade = {};
        boolean flag = true;

        while (flag) {
            System.out.print("명령어를 입력하세요 > ");
            cmd = sc.next();

            switch (cmd) {
                case "count" :
                    System.out.print("학생 수를 입력하세요 > ");
                    cnt = sc.nextInt();
                    student = new String[cnt][2];
                    grade = new int[cnt][3];
                    break;
                case "member" :
                    if (cnt == -1) {
                        System.out.println("학생 수를 입력하세요!");
                        break;
                    }
                    for (int i = 0; i < cnt; i++) {
                        System.out.print("학생 이름 : ");
                        student[i][0] = sc.next();
                        System.out.print("학생 주소 : ");
                        student[i][1] = sc.next();
                    }
                    break;
                case "grade" :
                    if (cnt == -1) {
                        System.out.println("학생 수를 입력하세요!");
                        break;
                    }
                    for (int i = 0; i < cnt; i++) {
                        System.out.print("국어 점수 : ");
                        grade[i][0] = sc.nextInt();
                        System.out.print("수학 점수 : ");
                        grade[i][1] = sc.nextInt();
                        System.out.print("영어 점수 : ");
                        grade[i][2] = sc.nextInt();
                    }
                    break;
                case "print" :
                    if (cnt == -1) {
                        System.out.println("학생 수를 입력하세요!");
                        break;
                    }
                    for (int i = 0; i < cnt; i++) {
                        System.out.println("이름 : " + student[i][0]);
                        System.out.println("주소 : " + student[i][1]);
                        System.out.println("국어 : " + grade[i][0]);
                        System.out.println("수학 : " + grade[i][1]);
                        System.out.println("영어 : " + grade[i][2]);
                        System.out.println("총점 : " + (grade[i][0] + grade[i][1] + grade[i][2]));
                        System.out.println("평균 : " + (grade[i][0] + grade[i][1] + grade[i][2]) / 3);
                        System.out.println("===============");
                    }
                    cnt = -1;
                    break;
                case "exit" : flag = false; break;
            }
        }
	}
}
