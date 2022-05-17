package quiz;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
	//수를 입력받아 0보다 크고 100보다 작으면 정상,
		//아니면 비정상으로 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int su = sc.nextInt();
		if(su > 0 && su < 100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
}
}
