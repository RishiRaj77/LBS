package aniket;

public class Palindrome {
	public static void main(String[] args) {
		int n =121;
		int temp=n;
		int rev =0;
		while(n!=0) {
			int r=n%10;
			rev = (rev*10)+r;
			n=n/10;
		}
		if (temp==rev) {
			System.out.println("palindrome");
			
		} else {
			System.out.println("is not a palindrome");

		}
	}
	

}
