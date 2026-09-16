class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                if (maxOnes < count) {
                    maxOnes = count;
                }
            }
            else {
                if (maxOnes < count) {
                    maxOnes = count;
                }
                count = 0;
            }

        }

        return maxOnes;
    }
}