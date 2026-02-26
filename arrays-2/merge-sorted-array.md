## Merge Sorted Array

`Easy`

### PROBLEM
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

### SOLUTION
- Create a counter `k` variable initialize with value length of largest array length and keep decreamenting the,
- Then we have to place two pointers on array m and array n at last element respectively and compare those two
values present at these location.
- copy the higher element at the location k and decrement k and val m or n whichever had the higher value.
- whichever has last smallest element will have value remained so we can take the residue elements at last by
iterating over it untill n or m becomes zero.
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int k = nums1.length -1;
        m = m -1;
        n = n -1;
        while (n >= 0 && m >= 0)
            nums1[k--]= (nums1[m]>nums2[n]) ? nums1[m--] : nums2[n--];
        while (m >= 0)
            nums1[k--] = nums1[m--];
        while (n >= 0)
            nums1[k--] = nums2[n--];
    }
}
```

| Space | O(1)      |
|-------|-----------|
| Time  |  O(n + m) |

