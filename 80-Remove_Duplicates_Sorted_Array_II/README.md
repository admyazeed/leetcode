# Solution

Uses a `seen` flag to check if a duplicate has already been visited, thus allowing at most 2 copies of a number.

## Time complexity

O(n)

## Space complexity

O(1)

# Solution 2

Similar to 26 - Remove Duplicates from Sorted array, except the value at the fast pointer is compared against the value *two* elements behind the write index, thus allowing at most one duplicate.

## Time complexity

O(n)

## Space complexity

O(1)
