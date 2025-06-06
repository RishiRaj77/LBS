package aniket;

public class Selection {
	public static void main(String[] args) {
		int []a= {64,25,12,22};
		int temp=0;
		int count =0;
		for (int i = 0; i < a.length; i++) {
			int min=i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] <a [min]) {
					min =j;
				}
				
			}
			if (i != min) {
			   
			    temp = a[i];
			    a[i] = a[min];
			    a[min] = temp;
			    count++;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] +" ");
			
		}
		System.out.println(" number of counts are "+count);
	}
	
	
	

}
