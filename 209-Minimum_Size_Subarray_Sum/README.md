# Solution

Uses a variable size sliding window. Grows the window from the right until the sum >= target, then shrinks from the left until minimum length of subarray is found.

## Time complexity

O(n)

Each element in the array is added or subtracted from the sum at most once.

## Space complexity

O(1)