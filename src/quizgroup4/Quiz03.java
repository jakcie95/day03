package quizgroup4;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//3.
		//�� �б��� ���� 6�� �ִ�. �� �л� ���� �Է��ϸ�, �� �� �ִ� �ο����� ����ϰ�,
		//���� �л� ���� �� ä�����ٸ� "�б� ����", 
		//�� ä������ ���ߴٸ� "�б��� �����մϴ�. ���� �л��� n���Դϴ�."��� ������ִ� ���α׷��� �ۼ��Ͻÿ�.
		//��� ���� �ο� ���� ���ƾ� �Ѵ�.
		int total;
		int max;
		int remain;
		System.out.println("�� �л��� : ");
		total = sc.nextInt();
		System.out.println("�� �� �ִ� �ο��� : ");
		max = sc.nextInt();
		remain = total % max;
		if(total%max == 0) {
			System.out.println("�б� ����");
		}else if(total%max != 0) {
			System.out.println("�б��� �����մϴ�.");
			System.out.println("���� �л��� " + remain +"�� �Դϴ�.");
		}
		sc.close();
}
}
