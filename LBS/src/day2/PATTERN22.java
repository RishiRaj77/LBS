package day2;

public class PATTERN22 {
	public static void main(String[] args) {
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j>=i) {
					System.out.print(i);
					
				}else {
					
					System.out.print(" ");
				}
			
				
			}
			System.out.println("  ");
			
		}
		
	}

}
