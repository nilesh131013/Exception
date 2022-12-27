package Questions;

public class Question9 {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		
		for(int i=0;i<10;i++) {
			int sum=num1+num2;
			
			num1=num2;
			num2=sum;
		
			System.out.print(sum+" ");
	}

}
}
