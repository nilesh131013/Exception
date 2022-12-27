package Questions;

import java.util.ArrayList;

public class QuestionArrayToArrayList {
	public static void main(String[] args) {
		
		int []num= {10,25,50,35,40};
   ArrayList<Integer>num1=new ArrayList<>();
   for(int i=0;i<num.length;i++) {
	   num1.add(num[i]);
   }
   
   Object[]num3=num1.toArray();
   for(Object a:num1) {
	   System.out.print(a+" ");
   }
	}
}
		
		