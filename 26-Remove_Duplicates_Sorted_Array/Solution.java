class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int current = 1;

        for (int i = 1;i<nums.length;i++){
            if (nums[i] != nums[current-1]){
                nums[current++] = nums[i];
            }
        }
        return current;
    }
}