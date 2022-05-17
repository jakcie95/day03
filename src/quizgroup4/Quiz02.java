package quizgroup4;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2.
		//나이를 입력받아서 성인과 미성년자로 구분하세요.
		//성인인 경우에 20 ~ 39세라면 '청년', 이 이상이면 '중장년'으로 구분합니다.
		//미성년인 경우에는 14 ~ 19세는 '청소년', 14세 미만은 '어린이'로 구분합니다.
				
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		if(age >= 20 && age <= 39) {
			System.out.println("청년 입니다.");
		}else if(age > 39) {
			System.out.println("중장년 입니다.");
		}else if(age >=14 && age <=19) {
			System.out.println("청소년 입니다.");
		}else {
			System.out.println("어린이 입니다");
		}
		
}
}
