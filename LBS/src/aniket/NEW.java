package aniket;

public class NEW {
	public static void main(String[] args) {
		int []a= {12,5,22,32,76};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
		}
		for (int i= 0;  i< a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	

}
