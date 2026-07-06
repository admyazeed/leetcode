# Solution 1

Uses Arrays.sort() to sort the input. The most frequent element will always be at position `n/2` due to the constraints of the problem.

## Time complexity

O(n log n)

The Arrays class in Java uses Dual-Pivot Quicksort algorithm for the sort() method.

## Space complexity

Auxiliary space required is O(log n) in the average and best cases, and O(n) in the worst case.

# Solution 2

Uses a HashMap to keep track of the frequency of each number. Returns when a number's count is greater than `n/2`.

## Time complexity

O(n)

Iterates over each item in the input array once.

## Space complexity

O(m), where m is the number of unique elements in the array.

HashMap contains entry for each number in the array.

# Solution 3

Uses Boyer-Moore Voting Algorithm.

## Time complexity

O(n)

Each item in the array is iterated over once.

## Space complexity

O(1)

No additional data structure is used.