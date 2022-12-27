package Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question18 {
	public static void main(String[] args) {
		
	
	
	List<Integer>num=Arrays.asList(10,15,20,25,30,35);
	
	List<Integer>num1=num.stream().sorted().collect(Collectors.toList());
	List<Integer>num2=num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("Ascending order : ");
	num1.forEach(x->System.out.print(x+" "));
	System.out.println("");
	System.out.println("Descending order: ");
	num2.forEach(y->System.out.print(y+" "));
	
	
}
	

}
