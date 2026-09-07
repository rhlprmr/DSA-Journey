class Solution {
    public void sortColors(int[] nums) {
        
        int countZeroes = 0;
        int countOnes = 0;
        int countTwos = 0;

        for (int ele: nums) {

            if (ele == 0) {
                countZeroes++;
            }
            else if (ele == 1) {
                countOnes++;
            }
            else {
                countTwos++;
            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (i < countZeroes) {
                nums[i] = 0;
            }
            else if (i < (countZeroes + countOnes)) {
                nums[i] = 1;
            }
            else if (i < (countZeroes + countOnes + countTwos)) {
                nums[i] = 2;
            }

        }

    }

}