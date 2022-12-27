package Questions;

import java.util.LinkedHashSet;

public class Question11 {

		public static void main(String[] args) {
			
			String s="abcabcabc";
			int a=0;
			int b=0;
			int c=0;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a') {
					 a++;
					
					
				}
				else if(s.charAt(i)=='b') {
				b++;
				}
				else if(s.charAt(i)=='c') {
					c++;
				}
			}
			
		        
				LinkedHashSet<Character>character=new LinkedHashSet<>();
				for(char x:s.toCharArray()) {
					character.add(Character.valueOf(x));
				}
				System.out.print(s+'\n'+"Characters Present: ");
				character.forEach(x->System.out.print(x));
				System.out.println('\n'+"count of a: "+a);
			    System.out.println("count of b: "+b);
			    System.out.println("count of c: "+c);
			
		}
		
		

	}



