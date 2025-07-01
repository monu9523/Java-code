package roshni;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the first number:");
		int num1= sc.nextInt();
		System.out.println("enter the second number:");
		int num2= sc.nextInt();
		
		System.out.println("choose operator:");
		char operator= sc.next().charAt(0);
		
		//swich case for operator
		
		switch(operator) {
		
		case '+':
			System.out.println("addition:"+(num1+num2));
		break;
		case '-':
			System.out.println("substraction:"+(num1-num2));
			break;
		case '%':
			System.out.println("modulus:"+(num1%num2));
            break;
		case '/':
			System.out.println("division:"+(num1/num2));
			break;
			default:
				System.out.println("invalid operator!!!");
		}
		

	}

}
