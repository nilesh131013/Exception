package Questions;

import java.util.Arrays;

public class Question24 {
	
	public static void main(String[] args) {
		int[]ar= {20,15,10,35,30,25};
		
		 for( int i=0;i<ar.length;i++) {
			 for(int j=i+1;j<ar.length;j++) {
				 
				 if(ar[i]>ar[j]) {
					 int temp=ar[i];
					 ar[i]=ar[j];
					 ar[j]=temp;
				 }
			 }
		 }
		 for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i]+" ");
			 
		 }
		
	}

}
