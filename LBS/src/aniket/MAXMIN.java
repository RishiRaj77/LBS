package aniket;

public class MAXMIN {
	public static void main(String[] args) {
		int[]a= {2,1,4,5,7};
		
		int min=a[0];
		int secmin=a[0];

		int max=a[0];
		int secmax=0;

		for (int i = 0; i < a.length; i++) {
			if (a[i]< min) {
				secmin=min;
				min=a[i];
				
		
			} 
			else if (a[i] < secmin && secmin != min) {
				secmin=a[i];
			}
			}
					
					
				

		for (int j = 0; j < a.length; j++) {
			if (a[j]> max) {
				secmax=max;
				max=a[j];
				
		
			} 
			else if (a[j] > secmax && secmax != max) {
				secmax=a[j];
			}

		
	}
		System.out.println(secmin + " and " + secmax );
	}
}


