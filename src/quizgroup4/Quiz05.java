package quizgroup4;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5.합창을 위해 키 순으로 사람들을 줄을 세우려고 한다.
		//170cm 이상은 '4번째 줄', 160cm 이상은 '3번째 줄', 150cm 이상은 '2번째 줄', 150cm 미만은 '1번째 줄'로 출력하세요
		double height;
		System.out.println("키는 몇 cm입니까? : ");
		height = sc.nextDouble();
		if(height >= 170) {
			System.out.println("4번째줄 입니다.");
		}else if(height >= 160) {
			System.out.println("3번째줄 입니다.");
		}else if(height >= 150) {
			System.out.println("2번째줄 입니다.");
		}else {
			System.out.println("첫번째줄입니다");
		}
		sc.close();		
}
}
