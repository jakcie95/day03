package quiz;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
	//���� �Է¹޾� 0���� ũ�� 100���� ������ ����,
		//�ƴϸ� ���������� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int su = sc.nextInt();
		if(su > 0 && su < 100) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
}
}
