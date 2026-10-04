# Solution 1

Uses a HashMap to store remainders (target - current number) with their index. Upon encountering a number already in the HashMap, return that index with current index (incremented by 1 because of 1-indexing).

This is the same as the Two Sum I solution.

## Time complexity

O(n)

## Space complexity

O(n)

## Solution 2

Uses a two-pointer algorithm. One pointer `i` starts at the beginning of the array, while `j` starts at the end. If `numbers[i] + numbers[j] < target`, then `numbers[i] + numbers[k] < target` for any `k<j`, because of the guarantee that the array is sorted. Thus `i` can be incremented. Conversely if `numbers[i] + numbers[j] > target` then `numbers[k] + numbers[j] > target` for any `k>i`, and so `j` is decremented. Otherwise, if `numbers[i] + numbers[j] = target`, then the solution has been found.

## Time complexity 

O(n)

## Space complexity

O(1)