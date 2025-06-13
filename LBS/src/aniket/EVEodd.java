package aniket;

public class EVEodd {
	public static void main(String[] args) {
		int []a= {10,2,3,4,5,7};
		int evcount=0;
		int odcount=0;

		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				evcount++;
				
			}
			else {
				odcount++;
			}
		}
		System.out.println(evcount);
		System.out.println(odcount);
	}

}
