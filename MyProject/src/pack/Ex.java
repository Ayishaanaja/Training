//to conver upper case letter to lower case and vice versa

package pack;

public class Ex {
public static void main(String[] args) {
	String str1="WeLcOmE";
	String result="";
	int ascii=0;
	for(int i=0;i<str1.length();i++)
	{
		if(Character.isUpperCase(str1.charAt(i)))
		{
			result+=Character.toLowerCase(str1.charAt(i));
		}
		else
		{
			result+=Character.toUpperCase(str1.charAt(i));
		}
	}
System.out.println(result);
}
}
