package day03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 if(���ǽ�){
		 	���ӹ���
		 }else if(���ǽ�){
		 	���ӹ���
		 }else if(���ǽ�){
		 	���ӹ���
		 }...
		 else{
		 	���ӹ���
		 }
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("���Է� : ");
		num = sc.nextInt();
		if(num > 100) {
			System.out.println("100���� ũ��");
		}else if(num > 70) {
			System.out.println("70���� ũ��");
		}else if(num > 40) {
			System.out.println("40���� ũ��");
		}else {
			System.out.println("�� ���� ��");
		}
		sc.close();
}
}
