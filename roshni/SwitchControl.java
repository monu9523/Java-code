package roshni;
import java.util.Scanner;
public class SwitchControl {
    public static void main(String[] args) {
     
    	Scanner sc= new Scanner(System.in);
    	System.out.println("enter the size:");
    int size= sc.nextInt();
    switch(size){
        case 1:
        System.out.println("extra small");
        break;
        case 2:
        System.out.print("small");
        break;
        case 3:
        System.out.println("medium");
        break;
        case 4:
        System.out.println("large");
        default:
        	System.out.println("invalid size number");

    }  
}
}