package day4;

public class Pattern1 {
	public static void main(String[] args) {
		for (int i =4; i >=0; i--) {
			for (int j = 0; j <=4; j++) {
				if (j==i||i==0||j==4) {
					System.out.print("*");
					
				}
				else {
					System.out.print("");
				}
				
				
			}
			System.out.println();
			
		}
	}

}






