package Questions;

import java.util.Arrays;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		
		
List<Integer> num= Arrays.asList(15000,20000,25000,30000,350000);
		
		int max=num.stream().max(Integer::compare).get();
		System.out.println("Maximum salary :"+max);
		
		
		
		
		
	      
	
	
	
	}

}
