First solution `twosum.py`:
- Time complexity: O(n^2)
  - For each item in the list [O(n)], evaluate the conditional `if (num) in remainders` which is also O(n), giving O(n^2) time complexity.
  - Additionally, the final iteration `remainders.index(num)` is also O(n) but only happens once.
- Space complexity: O(n)
  - `remainders` array length = input array length

Second solution `twosum2.py`:
- Time complexity: O(n)
  - Uses hash map, so conditional is evaluated in O(1) average time.
- Space complexity: O(n)
  - Same as array version
