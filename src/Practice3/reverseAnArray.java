package Practice3;

public class reverseAnArray {

	public static void main(String[] args) {

		int num = 6789;
        int original = num;

        int reverse = 0;
        int digits = 0;

        // Step 1: Reverse + count digits
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
            digits++;
        }

        // Step 2: Create 10^digits manually
        int multiplier = 1;
        for (int i = 0; i < digits; i++) {
            multiplier = multiplier * 10;
        }

        
        int result = reverse * multiplier;

        System.out.println("Result: " + result+" ");

	}

}
