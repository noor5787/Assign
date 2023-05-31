package in.ineuron.in;

import java.util.Arrays;

public class MoveZeros {
	
	    public static void main(String[] args) {
	        int[] nums = {0, 1, 0, 3, 12};
	        moveZerosToEnd(nums);
	        System.out.println(Arrays.toString(nums));
	    }
	    
	    public static void moveZerosToEnd(int[] nums) {
	        int index = 0; 
	        
	        // Traverse the array and move non-zero elements to the front
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[index] = nums[i];
	                index++;
	            }
	        }
	        
	        // Fill the remaining elements with zeros
	        while (index < nums.length) {
	            nums[index] = 0;
	            index++;
	        }
	    }
	}


