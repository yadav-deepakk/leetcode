## Majority Element - I

`Easy`

### PROBLEM
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that
the majority element always exists in the array.

### SOLUTION
**[A] Naive Solution: Using a map keep frequency**
- We can use a map and iterate over all elements present in the array, keep frequency count of
each element tracked.
- We can then iterate over the map and check whose frequency is more than n/2. Moment we find
such element we can return that element.
```java
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) { return num; }
        }
        return -1;
    }
}
```

|   Space   |   O(n)    |
|-----------|-----------|
|   Time    |   O(n)    |

**[B] Optimal Algorithm : Moore's voting algorithm**
- As per moore's algorithm if any number has more frequency them if we tried setting off each
available number with the dominating one, still the leftover portion will be dominating one.
- so using the same idea in given problem we will keep track of frequency and current number,
moment we encounter the new number than the previous we have to decrease the frequency
- if frequency reaches to zero then just start counting from the start and change the new number
as the current number, since one number among all appears more than n/2 times, left value at last
will be the most occuring one, as it dominates over others occurance.
```java
class Solution {
  public int majorityElement(int[] nums) {
    int freq = 0, ans = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (freq == 0) ans = nums[i];
      if (nums[i] == ans) freq++;
      else freq--;
    }
    return ans;
  }
}
```

|   Space   |   O(1)    |
|-----------|-----------|
|   Time    |   O(n)    |

