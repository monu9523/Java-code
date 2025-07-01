package roshni;

public class Swap {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		System.out.println("before swap :a="+a +", b="+b);
		
		//using third varible
		//int temp=a;
		//a=b;
		//b=temp;
		//System.out.println("after swap :a="+a+",b="+b);
		
		//without using temp varible
		 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap : a="+a+",b="+b);
	}

}
