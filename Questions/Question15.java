package Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question15 {
public static void main(String[] args) {
	
	List<String>a=Arrays.asList("one","one","two","three","two");
	List<String>b=a.stream().distinct().collect(Collectors.toList());
	b.forEach(x->System.out.print(x+" "));
	
	
	
	
	
}
}
