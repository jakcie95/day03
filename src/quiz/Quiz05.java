package quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//100������ �ִ� ���¿��� ���� ������ ���� �Է��ؼ�
		//�����ѵ� �ܾ� ����ϱ�
		//������ �ݾ��� 100���� ���� ������ �ܾ׺��� ���
		int bank = 1000000;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ݾ��� �Է��� �ֽʽÿ�");
		int a =sc.nextInt();
		if(a > bank) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else if(a % 10000 != 0) {
			System.out.println("���� �����θ� ���� �����մϴ�.");
		}else {
			System.out.println(a + "���� ����մϴ�.");
			System.out.println("�ܾ���" + (bank - a) +"�� �Դϴ�.");
		}
	}

}
