package Questions;

public class Question21 {
	public static void main(String[] args) {
		
		StringBuffer name=new StringBuffer("onesoft");
		name.reverse();
		System.out.println(name);
		
		String name1="onesoft";
		String a="";
		for(int i=name1.length()-1;i>=0;i--) {
			a=a+name1.charAt(i);
			
		}
		System.out.println(a);
		
		
		
	}

}
