package day2;

public class PATTERN26 {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= 5; j++) {
				if (j>=i) {
					System.out.print(k);
					
				}else {
					
					System.out.print(" ");
				}
			
				
			}
			k++;
			System.out.println("  ");
			
		}
		
	}

}
