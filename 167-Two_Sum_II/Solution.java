import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
      HashMap<Integer, Integer> remainders = new HashMap<>();
      int[] result = new int[2];
      for (int i=0;i<numbers.length;i++){
          if (remainders.containsKey(numbers[i])){
              result[0] = remainders.get(numbers[i]);
              result[1] = i+1;
              return result;
          }
          remainders.put(target - numbers[i], i+1);
      }
      return result;
    }
}