package aniket;

public class Threearr {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {1,2,4,5};
		int[]c= {1,2,4};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {

					if (a[i] == b[j] && b[j] == c[k]) {
					System.out.println("repeting element is " + a[i]);
					
				}
			}
		}

	}

}
}
