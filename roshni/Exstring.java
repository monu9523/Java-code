package roshni;

public class Exstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "roshni";
		System.out.println(name.length());
		// concatenation
		String s1="hello";
		String s2="friends";
		
		System.out.println(s1+s2);
//characterAt--which char is present at incdex number 2
		String s3="java language";
		System.out.println(s3.charAt(2));
		
		//replace the char a with another char t
		String s4= s3.replace('a','t');
		System.out.println(s4); 
		
		//substring
		System.out.println(s3.substring(4,9));

	}

}
