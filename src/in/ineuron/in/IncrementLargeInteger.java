package in.ineuron.in;
import java.util.Arrays;
public class IncrementLargeInteger {



	    public static int[] plusOne(int[] digits) {
	        int n = digits.length;
	        
	        
	        digits[n - 1] += 1;
	        
	  
	        int carry = digits[n - 1] / 10;
	        digits[n - 1] %= 10;
	        
	        // Iterate from the second least significant digit
	        for (int i = n - 2; i >= 0 && carry > 0; i--) {
	            digits[i] += carry;
	            carry = digits[i] / 10;
	            digits[i] %= 10;
	        }
	        
	        // If there's still a carry after iterating through all digits,
	        // create a new array with a higher length and add the carry as the most significant digit
	        if (carry > 0) {
	            int[] result = new int[n + 1];
	            result[0] = carry;
	            System.arraycopy(digits, 0, result, 1, n);
	            return result;
	        }
	        
	        return digits;
	    }

	    public static void main(String[] args) {
	        int[] digits = {1, 2, 3};
	        int[] result = plusOne(digits);
	        System.out.println(Arrays.toString(result));
	    }
	}



