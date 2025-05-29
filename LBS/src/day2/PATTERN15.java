package day2;

public class PATTERN15 {
	public static void main(String[] args) {
	for (char i = 'A'; i <= 'E'; i++) {
		for (char j = 'A'; j <= 'E'; j++) {
			
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
