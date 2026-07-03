# Solution

Two pointer solution, with `i` scanning from the front and `j` from the back. For each value in `nums`, if the value is not equal to the target, increment the counter `k`. If the value at `i` equals the target value, swap the last non-target value at position `j` and increment `k`.

## Time complexity
O(n) where n is the length of the input array.

## Space complexity
O(1)

Input array is modified in-place.

# Solution 2

Two pointer solution using one slow pointer `index` and one fast pointer `i`. Minimizes unnecessary swaps and writes from other solution, and is more readable.

## Time complexity
O(n) where n is the length of the input array.

## Space complexity
O(1)

Input array is modified in-place.