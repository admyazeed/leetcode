# Solution
Uses two pointer approach, one reading from string `s` and the other from string `t`. The character at each pointer is compared. If it does not match, the pointer for `t` increments until it does or until the string terminates.

## Time complexity
O(n), where n is the length of the string `t`.

## Space complexity
O(1)