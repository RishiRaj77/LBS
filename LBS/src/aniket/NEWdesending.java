package aniket;

public class NEWdesending {
 public static void main(String[] args) {
	int[]a= {21,11,23,5,4,14,11,21};
	int temp=0;
	int dub=0;;
	for (int i = 0; i < a.length-1; i++) {
		  dub=i;
		for (int j = 0; j < a.length-1; j++) {
			if (a[j]== a[j-1]) {
				dub=j;
				
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println(dub);
}
}
