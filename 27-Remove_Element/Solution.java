class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val
        int j = nums.length - 1; // Pointer to the last element

        for (int i = 0; i < nums.length; i++) {
            if (i > j) {
                break;
            }
            else if (nums[i] != val){
                k++;
            }
            else{
                while (j>= i && nums[j] == val){
                    j--;
                }
                if (i > j){
                    break;
                }
                nums[i] = nums[j];
                nums[j] = val;
                k++;
            }
        }
        return k;
    }
}