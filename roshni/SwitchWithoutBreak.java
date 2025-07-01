package roshni;
import java.util.Scanner;
public class SwitchWithoutBreak {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the day:");
		int day =sc.nextInt();
		
		String dayType;
		String dayString;
		
		switch(day) {
		case 1:
			dayString="MONDAY";
			break;
		case 2:
			dayString="Tuesday";
			break;
		case 3:
			dayString="Wednesday";
			break;
		case 4:
			dayString="thrusday";
			break;
		case 5:
			dayString="Friday";
			break;
		case 6:
			dayString="Saturday";
			break;
		case 7:
			dayString="Sunday";
			break;
			default:
				dayString="invalid day";
		}
		
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayType="weakday";
			break;
		case 6:
		case 7:
			dayType="weekend";
			break;
			default:
				dayType="invalid daytype";
		}
		System.out.println(dayString + " is "+ dayType);
	}
			
		
		
	}


