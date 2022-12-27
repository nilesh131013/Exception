package Questions;

public class Question14 {
	public static void main(String[] args) {
		
		int[]num= {10,15,20,25,30,35};
		
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("Maximum element: "+max);
		
		
		
		
		
	} 
	

}
