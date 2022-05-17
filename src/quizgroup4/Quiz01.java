package quizgroup4;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.
		// 국어, 영어, 수학 점수를 입력받고 평균이 80점 이상이면 "합격"을 출력하세요.
		//- 단, 한 과목이라도 60점 미만일시 "불합격"을 출력하세요.
		int kr, eng, math;
		System.out.println("국어 점수 : ");
		kr = sc.nextInt();
		System.out.println("영어점수 : ");
		eng = sc.nextInt();
		System.out.println("수학점수 : ");
		math = sc.nextInt();
		int sum = kr + eng + math;
		double avg = sum/3;
		if(kr < 60 || eng < 60) {
			System.out.println("불합격");
		}else if(math < 60) {
			System.out.println("불합격");
		}else if(avg >= 80) {
			System.out.println("합격");
		}
}
}
