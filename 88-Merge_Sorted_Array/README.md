# Solution

Uses two pointers i and j pointing to the last non-zero element of nums1 and nums2 respectively. nums1 is then iterated over from back to front. For each index, the values under pointers i and j are compared and the highest one is placed at that index position and the pointer is decremented. If i or j is less than zero, only the other nonnegative pointer is considered.

## Time complexity
O(m + n), where m + n is the length of nums1.

At each index in nums1 there is a comparison between the pointer values and an assignment.

## Space complexity
O(1)

No additional data structure is used.

