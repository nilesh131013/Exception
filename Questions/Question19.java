package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Question19 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Nilesh","Venkat","Aravindan","Manoj","Nilesh");
		List<String>names1=names.stream().distinct().collect(Collectors.toList());

		
		
		
		List<String>a=new ArrayList<>();
		for(int i=0;i<names.size();i++) {
			a.add(names.get(i));
			
		}
		
		Set<String>b=new HashSet<> ();
		for(int i=0;i<names.size();i++) {
			b.add(names.get(i));
		}
		
		
		Map<String,String>d=new HashMap<>();
		for(String x:names ) {
			d.put(x,x);
			
		}
		
		
		HashMap<Integer,String> c=new HashMap<>();
		c.put(101, "Nilesh");
		c.put(102, "Venkat");
		c.put(103, "Rajesh");
		c.put(104, "Ranganathan");
		c.put(105, "Samuels");
		
		
		
			
			
			
				
		
		
		
		
	



	}

}
