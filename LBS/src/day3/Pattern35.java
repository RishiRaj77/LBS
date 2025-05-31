package day3;

public class Pattern35 {
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (i=='A' || i==j || j== 'E') {
					System.out.print(j);
					
				} else {
					System.out.print(" ");

				}
			
				
			}
			System.out.println();
			
		}
	}

}
