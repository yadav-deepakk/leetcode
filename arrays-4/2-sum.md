## 2 Sum

`Easy`

### PROBLEM
Given an array of integers nums and an integer target, return indices of the two numbers such that
they add up to target. You may assume that each input would have exactly one solution, and you may
not use the same element twice. You can return the answer in any order.

### SOLUTION
**[A] Naive Solution: Using 2 loops**
- We can look for those 2 numbers by using two loops
- we will first place a pointer at first location and look for the second number in the remaining
array elements by again looping over remaining with another loop.
```java
public class Solution{

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // if no solution
    }
}
```

| Space | O(1) |
|-------|------|
| Time  | O(n<sup>2</sup>) |

**[B] Optimal Solution: Using a Map**
- We can use a map that will simply store all the traversed elements and at the time of looking for
complementary number we can look into the stored numbers inside the map.
- As the map lookup is just O(1) this makes this algorithm time efficient.
```java
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // if no solution
    }
}
```

| Space | O(n) |
|-------|------|
| Time  | O(n) |

