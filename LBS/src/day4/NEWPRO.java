package day4;

public class NEWPRO {
    public static void main(String[] args) {
        int n = 5; // Example input
        int fact = 1;
        for (int i = 1; i <= n; i++) {
           
        	fact = fact * i;

            
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
