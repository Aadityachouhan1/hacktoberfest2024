import java.util.HashMap;

public class TwoSum {
    // Function to find two numbers that add up to the target
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // If the complement is found in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found (as per problem assumption, there is always one)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
       
