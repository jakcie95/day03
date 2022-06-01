package quizgroup4;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//3.
		//한 학교에 반이 6개 있다. 총 학생 수를 입력하면, 반 당 최대 인원수를 출력하고,
		//남은 학생 없이 다 채워졌다면 "학기 시작", 
		//다 채워지지 못했다면 "학급이 부족합니다. 남은 학생은 n명입니다."라고 출력해주는 프로그램을 작성하시오.
		//모든 반의 인원 수는 같아야 한다.
		int total;
		int max;
		int remain;
		System.out.println("총 학생수 : ");
		total = sc.nextInt();
		System.out.println("반 당 최대 인원수 : ");
		max = sc.nextInt();
		remain = total % max;
		if(total%max == 0) {
			System.out.println("학기 시작");
		}else if(total%max != 0) {
			System.out.println("학급이 부족합니다.");
			System.out.println("남은 학생은 " + remain +"명 입니다.");
		}
		sc.close();
}
}
