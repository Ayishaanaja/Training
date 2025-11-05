//to change WeLcOmE to wElCoMe
package pack;

public class Ascii {
	public static void main(String[] args) {
		String str1="WeLcOmE";
		String result="";
		int ascii=0;
		for(int i=0;i<str1.length();i++)
		{
			ascii=str1.charAt(i);
			if(ascii>=65 && ascii<=90)
			{
				result+=String.valueOf((char)ascii).toLowerCase();
			}
			else
			{
				result+=String.valueOf((char)ascii).toUpperCase();
			}
		}
		System.out.println(result);
	}

}
