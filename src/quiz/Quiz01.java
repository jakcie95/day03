package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//수를 입력 받아 5의 배수인지 아닌지 구분
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int su = sc.nextInt();
		if(su%5 == 0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("5의 배수가 아님");
		}
		sc.close();

}
}
