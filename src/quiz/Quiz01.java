package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//���� �Է� �޾� 5�� ������� �ƴ��� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int su = sc.nextInt();
		if(su%5 == 0) {
			System.out.println("5�� ���");
		}else {
			System.out.println("5�� ����� �ƴ�");
		}
		sc.close();

}
}
