package pack;

public class DecimalToBinary {
public static void main(String[] args) {
	int x=27;
	int rem=0;
	String binary="";
	while(x>0)
	{
		rem=x%2;
		binary=rem+binary;
		x=x/2;
	}
	System.out.println(binary);
}
}
