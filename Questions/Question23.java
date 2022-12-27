package Questions;

public class Question23 {
	public static void main(String[] args) {
		
		int num=13;
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==true) {
			System.out.println(num+" :It is prime number");
		}
		else {
			System.out.println(num+" :It is not prime number");
		}
		
		
		
		
		
	}

}
