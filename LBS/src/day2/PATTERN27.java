package day2;

public class PATTERN27 {
	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i--) {
			int k = 1;
			for (int j = 1; j <= 5; j++) {
				if (j>=i) {
					System.out.print(k);
					k++;
				}else {
					
					System.out.print(" ");
				}
			
				
			}
		
			System.out.println("  ");
			
		}
		
	}

}
