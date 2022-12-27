package Questions;

import java.util.ArrayList;
import java.util.List;

public class Question301 {
public static void main(String[] args) {
		
		Question3 one=new Question3("Nilesh",150000,26);
		Question3 two=new Question3("Jagadis",175000,28);
		Question3 three=new Question3("Devaraj",200000,24);
		
		List<Question3>employee=new ArrayList<>();
	     employee.add(one);
	     employee.add(two);
	     employee.add(three);
	    int a=employee.stream().map(x->x.getEmpAge()).max(Integer::compare).get();
	    System.out.println("Maximum age: "+a);
	     
		
}

}
