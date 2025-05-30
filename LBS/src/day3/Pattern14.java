package day3;

public class Pattern14 {
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (i=='A' || j=='A' || i== 'E'|| j=='E') {
					System.out.print(i);
					
				} else {
					System.out.print(" ");

				}
			
				
			}
			System.out.println();
			
		}
	}

}
