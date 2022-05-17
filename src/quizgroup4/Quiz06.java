package quizgroup4;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//6.국어, 영어, 수학 점수를 입력하여 평균 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C',
				//그 이외에는 'D'를 출력하세요.
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		int sum;
		double avg;
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		math = sc.nextInt();
		sum = kor + eng + math;
		avg = sum/3;
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		sc.close();
}
}
