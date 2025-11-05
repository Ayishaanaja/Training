package pack;

import java.util.Scanner;

public class DecimalB {
	public static void main(String[] args) {
		int result=0;
		String binary="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num>0)
		{
			result=(num%2);
			binary=result+binary;
			num=num/2;
		}
		System.out.println(binary);
	}

}
