package Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question25 {
	public static void main(String[] args) {
		
		
		List<Integer>num=Arrays.asList(10,15,20,25,30);
		int secondMax=num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second max Number: "+secondMax);

		
		
		int[]num1= {15,25,20,30,50,18,45,35};
		int temp=0;
		for(int i=0;i<num1.length;i++ ) {
			for(int j=i+1;j<num1.length;j++) {
				if(num1[i]>num1[j]) {
					temp=num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
					
				}
			}
		}
		
		System.out.println("SecondMax number :"+num1[num1.length-2]);
		
		
	}

}
