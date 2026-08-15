# Solution

Iterate over the characters in `magazine` and create a HashMap containing character, count pairs. Then iterate over `ransomNote` decrementing the count for each occurence of a character. If the count drops below zero or the character is not found in the HashMap, return false. Otherwise, return true.

## Time complexity

O(m + n)

Where `m` and `n` are the lengths of `magazine` and `ransomNote` respectively.

## Space complexity

O(k) => O(1)

Where `k` is the number of unique characters in `magazine`.

# Solution 2

Uses an integer array instead of a hashmap. Since only lowercase english characters are used, an array of length 26 is used where each element corresponds to the frequency of the corresponding letter in `magazine` (element 0 is 'a', element 1 is 'b' and so on). Then for each character in `ransomNote` its corresponding frequency is decremented. If any letter's frequency drops below 0, return false, otherwise return true.

## Time complexity

O(m + n)

Iterates over both strings.

## Space complexity

O(26) => O(1)