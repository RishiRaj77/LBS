package day3;

public class Pattern24 {
	public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                if (j == 'A' || j == i || i == 'E') {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
