package day3;

public class Pattern23 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                if (j == 'A' || j == i || i == 'E') {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
