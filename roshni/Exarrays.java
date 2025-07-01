package roshni;
import java .util.Arrays;
public class Exarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int marks[]= new int[5];
      marks[0]=100;
      marks[1]=85;
      marks[2]=96;
      marks[3]=79;
      marks[4]=89;
      //length of array
      System.out.println(marks.length);
      
      //sort the array
      Arrays.sort(marks);
      System.out.println(marks[4]);
	}

}
