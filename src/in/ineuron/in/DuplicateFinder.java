package in.ineuron.in;
import java.util.HashSet;
public class DuplicateFinder {


	    public static boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();

	        for (int num : nums) {
	            if (set.contains(num)) {
	                return true; // Found a duplicate element
	            }
	            set.add(num);
	        }

	        return false; // No duplicates found
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 1};

	        if (containsDuplicate(nums)) {
	            System.out.println("Output: true");
	        } else {
	            System.out.println("Output: false");
	        }
	    }
	}



