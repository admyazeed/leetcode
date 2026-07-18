class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        boolean seen = false;

        while (j < nums.length) {
            if (nums[i - 1] != nums[j]) {
                nums[i++] = nums[j];
                seen = false;
            } else if (!seen) {
                nums[i++] = nums[j];
                seen = true;
            }
            j++;
        }
        return i;
    }
}