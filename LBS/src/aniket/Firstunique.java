package aniket;

public class Firstunique {
	public static void main(String[] args) {
		int[]arr= {1,1,2,2,3,4,4,5,5};
		int n = arr.length;
        int unique = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                unique = arr[i];
                break;
            }
        }

        if (unique != -1) {
            System.out.println("The unique element is: " + unique);
        } else {
            System.out.println("No unique element found.");
        }

	}

}
