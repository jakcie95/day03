package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		//���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���, �ƴ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int su = sc.nextInt();
		if(su%6 == 0) {//su%2 == 0 && su%3 == 0
			System.out.println("¦���鼭 3�� ���");
		
		}else {
			System.out.println("�ƴ�");
		}
		//���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���
		//3�� ����� �ƴϸ�, ¦���� �ش��ϸ� ¦��, �Ǵ� Ȧ��
		//¦���� �ƴϸ�, 3�� ������� �ش��ϸ� 3�� ���, �ƴ�
		//�ش� ���� ������ �ش���� ����
		System.out.println("�� �Է� : ");
		int su2 = sc.nextInt();
		if(su2%6 == 0) {
			System.out.println("¦���鼭 3�� ���");
		}else {
			if(su2%3 == 0) {
				System.out.println("3�� ���");
			}else {
				if(su2%2 == 0) {
					System.out.println("¦��");
				}else {
					System.out.println("�ش����");
				}
			}
		}
		
		
}
}
