class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 0;

        if (nums.length != 0) {

            int setup = nums[0];
            count = 1;

            for (int i = 0; i < nums.length; i++) {

                if (setup != nums[i]) {
                    nums[count] = nums[i];
                    setup = nums[i];
                    count++;
                }
            }

        }

        return count;

    }
}