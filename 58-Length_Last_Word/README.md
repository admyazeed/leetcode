# Solution 1
Uses built-in string methods to trim the input, split into array of substrings, and then returns the length of the last element in the array.

## Time complexity
O(n)

trim() and split() O(n).

## Space complexity
O(n)

# Solution 2
Scans string backwards from the end, incrementing length variable when character is not a space. Returns length after last word counted.

## Time complexity
O(n)

## Space complexity
O(1)