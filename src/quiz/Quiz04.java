package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//정수 3개를 입력받아 최대값과 최소값을 구하시오 
		Scanner sc = new Scanner(System.in);
	        System.out.print("정수 3개 입력: ");
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
	        System.out.println("최대값 : " + max);
	        System.out.println("최소값 : " + min);
	        sc.close();
	}
}


