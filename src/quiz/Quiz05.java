package quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//100만원이 있는 계좌에서 만원 단위로 돈을 입력해서
		//인출한뒤 잔액 출력하기
		//인출할 금액이 100만원 보다 많을시 잔액부족 출력
		int bank = 1000000;
		Scanner sc = new Scanner(System.in);
		System.out.println("인출할 금액을 입력해 주십시오");
		int a =sc.nextInt();
		if(a > bank) {
			System.out.println("잔액이 부족합니다.");
		}else if(a % 10000 != 0) {
			System.out.println("만원 단위로만 인출 가능합니다.");
		}else {
			System.out.println(a + "원을 출금합니다.");
			System.out.println("잔액은" + (bank - a) +"원 입니다.");
		}
	}

}
