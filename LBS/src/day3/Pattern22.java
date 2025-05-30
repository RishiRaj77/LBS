package day3;

public class Pattern22 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==0 || i==j || i== 4) {
					System.out.print(j);
					
				} else {
					System.out.print(" ");

				}
			
				
			}
			System.out.println();
			
		}
	}


}
