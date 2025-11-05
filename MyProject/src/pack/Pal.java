package pack;

public class Pal {
public static void main(String[] args) {
	int num=112181;
	int pal=0,dum;
	int hi=num;
	while(num>0)
	{
		dum=num%10;
		pal=(pal*10)+dum;
		num=num/10;
	}
	System.out.println(pal==hi);
}
}
