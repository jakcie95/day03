package quizgroup4;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.
		// ����, ����, ���� ������ �Է¹ް� ����� 80�� �̻��̸� "�հ�"�� ����ϼ���.
		//- ��, �� �����̶� 60�� �̸��Ͻ� "���հ�"�� ����ϼ���.
		int kr, eng, math;
		System.out.println("���� ���� : ");
		kr = sc.nextInt();
		System.out.println("�������� : ");
		eng = sc.nextInt();
		System.out.println("�������� : ");
		math = sc.nextInt();
		int sum = kr + eng + math;
		double avg = sum/3;
		if(kr < 60 || eng < 60) {
			System.out.println("���հ�");
		}else if(math < 60) {
			System.out.println("���հ�");
		}else if(avg >= 80) {
			System.out.println("�հ�");
		}
}
}
