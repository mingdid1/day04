package for_;

public class TestClass04 {
	public static void main(String[] args) {
		
		int i;
		for (i= 1; i< 10; i += 2) {
			System.out.print("i : " +i);
		}
		System.out.println("-----------------------");
		for(i =1; i<= 10; i++) {
			System.out.print("i : " + i + " => ");
			if (i%2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			System.out.println("++++++");
			
		}
		
		
	}
}
