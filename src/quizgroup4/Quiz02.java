package quizgroup4;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2.
		//���̸� �Է¹޾Ƽ� ���ΰ� �̼����ڷ� �����ϼ���.
		//������ ��쿡 20 ~ 39����� 'û��', �� �̻��̸� '�����'���� �����մϴ�.
		//�̼����� ��쿡�� 14 ~ 19���� 'û�ҳ�', 14�� �̸��� '���'�� �����մϴ�.
				
		System.out.println("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		if(age >= 20 && age <= 39) {
			System.out.println("û�� �Դϴ�.");
		}else if(age > 39) {
			System.out.println("����� �Դϴ�.");
		}else if(age >=14 && age <=19) {
			System.out.println("û�ҳ� �Դϴ�.");
		}else {
			System.out.println("��� �Դϴ�");
		}
		
}
}
