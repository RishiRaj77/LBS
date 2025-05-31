package day3;

public class Pattern5 {
	public static void main(String[] args) {
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= 4; j++) {
				if (j==4 || i==j || i== 0) {
					System.out.print(" * ");
					
				} else {
					System.out.print("   ");

				}
			
				
			}
			System.out.println();
			
		}
	}

}
