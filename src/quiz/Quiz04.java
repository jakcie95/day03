package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//���� 3���� �Է¹޾� �ִ밪�� �ּҰ��� ���Ͻÿ� 
		Scanner sc = new Scanner(System.in);
	        System.out.print("���� 3�� �Է�: ");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        int num3 = sc.nextInt();
	        int max = num1;
	        int min = num1;
	        
	        if (num2 < num3) {
	            if (num3 > max) {
	                max = num3;
	            } 
	        } else if (num2 > max) {
	            max = num2;
	        }
	        
	        if (num2 < num3) {
	            if (num2 < min) {
	                min = num2;
	            }else if (num3 < min) {
	                min = num3;
	            }
	        }
	        System.out.println("�ִ밪 : " + max);
	        System.out.println("�ּҰ� : " + min);
	        sc.close();
	}
}


