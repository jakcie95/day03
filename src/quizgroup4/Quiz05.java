package quizgroup4;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5.��â�� ���� Ű ������ ������� ���� ������� �Ѵ�.
		//170cm �̻��� '4��° ��', 160cm �̻��� '3��° ��', 150cm �̻��� '2��° ��', 150cm �̸��� '1��° ��'�� ����ϼ���
		double height;
		System.out.println("Ű�� �� cm�Դϱ�? : ");
		height = sc.nextDouble();
		if(height >= 170) {
			System.out.println("4��°�� �Դϴ�.");
		}else if(height >= 160) {
			System.out.println("3��°�� �Դϴ�.");
		}else if(height >= 150) {
			System.out.println("2��°�� �Դϴ�.");
		}else {
			System.out.println("ù��°���Դϴ�");
		}
		sc.close();		
}
}
