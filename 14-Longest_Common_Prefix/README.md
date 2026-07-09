# Solution

Iterates through input array, storing current longest common prefix using a StringBuilder. For each string in array, compare each character to longest common prefix and update accordingly.

## Time complexity
O(S), where S is the sum of the lengths of all strings in input.

## Space complexity
O(1)

# Solution 2

Begins with the prefix equal to the first item in the array. Then iterates over input array, removing the last letter from the current prefix until it matches with the current string, and returns the final prefix.

## Time complexity
O(S), where S is the sum of the lengths of all strings in input.

## Space complexity
O(1)