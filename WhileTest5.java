package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("다음과 같이 출력");
		System.out.println("------------");
		System.out.print("오늘의 기온은? ");
		int input = sc.nextInt();
		System.out.println("오늘 나의 평가는?");
		char eva = sc.next();
		System.out.print("나의 신발 발사이즈는?");
		double size = sc.nextDouble();
		System.out.println("------------");
		System.out.print("오늘은" + input + "도");
		System.out.print("신발은" + size);
		
		
		
	}//main
}//class
