package Questions;

public class Question28 {
	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++) {
			if(i%3==0) {
				System.out.println(i+": divisible by 3");
				if(i%6==0) {
					System.out.println(i+": divisible by 6");
					
					if(i%3==0&&i%6==0) {
						System.out.println(i+":divisible by 3 & 6");
		
	}
				}
			}
		}
	}
}
