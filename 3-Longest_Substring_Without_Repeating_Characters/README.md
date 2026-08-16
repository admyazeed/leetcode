# Solution

Use a variable sliding window to check for longest substring of unique characters. Maintain a hashset of seen characters in current window.

## Time complexity

O(n)

## Space complexity

O(1)

Bounded by the size of the alphabet (in this case "English letters, digits, symbols and spaces") but simplifies to O(1).
