package quizgroup4;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//6.����, ����, ���� ������ �Է��Ͽ� ��� 90�� �̻��̸� 'A', 80�� �̻��̸� 'B', 70�� �̻��̸� 'C',
				//�� �̿ܿ��� 'D'�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		int sum;
		double avg;
		System.out.println("���� ���� : ");
		kor = sc.nextInt();
		System.out.println("���� ���� : ");
		eng = sc.nextInt();
		System.out.println("���� ���� : ");
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
