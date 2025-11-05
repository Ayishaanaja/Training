//to print a 2D array
package pack;

import java.util.Scanner;

public class matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[2][3];
	System.out.println("enter the numbers");
	for(int i=0;i<2;i++)
		for(int k=0;k<3;k++)
			arr[i][k]=sc.nextInt();
	for(int i=0;i<2;i++)
	{
		for(int k=0;k<3;k++)
		{
			System.out.print(arr[i][k]+"\t");
		}
	System.out.println();
	}
}
}