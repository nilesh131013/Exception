package Questions;

public class Question26 {
	public static void main(String[] args) {
		
		
		int[]num= {7,5,6,4,7,9,5};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.print(num[j]+" ");
				}
			}
		}
		
		
	}

}
