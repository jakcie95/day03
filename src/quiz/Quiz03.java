package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		//수를 입력 받아 짝수이면서 3의 배수이면 출력, 아님
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int su = sc.nextInt();
		if(su%6 == 0) {//su%2 == 0 && su%3 == 0
			System.out.println("짝수면서 3의 배수");
		
		}else {
			System.out.println("아님");
		}
		//수를 입력 받아 짝수이면서 3의 배수이면 출력
		//3의 배수가 아니며, 짝수만 해당하면 짝수, 또는 홀수
		//짝수가 아니며, 3의 배수에만 해당하면 3의 배수, 아님
		//해당 되지 않으면 해당되지 않음
		System.out.println("수 입력 : ");
		int su2 = sc.nextInt();
		if(su2%6 == 0) {
			System.out.println("짝수면서 3의 배수");
		}else {
			if(su2%3 == 0) {
				System.out.println("3의 배수");
			}else {
				if(su2%2 == 0) {
					System.out.println("짝수");
				}else {
					System.out.println("해당없음");
				}
			}
		}
		
		
}
}
