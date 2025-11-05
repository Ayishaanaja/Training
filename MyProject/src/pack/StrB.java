package pack;

public class StrB {
public static void main(String[] args) {
	        String str = "Hello World";

	        // Convert String to StringBuilder
	        StringBuilder sb = new StringBuilder(str);

	        // Reverse the StringBuilder
	        sb.reverse();

	        // Print using the StringBuilder object
	        System.out.println(sb); // No need to call toString(), it's implicit
	    }
	}

