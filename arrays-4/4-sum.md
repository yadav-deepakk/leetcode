## 4 Sum

`Medium`

### PROBLEM
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

### SOLUTION
**[A] Naive Approach**
- we can look for all 4 numbers one by one using four loops
- in each loop we can fix 1 element and look for remaining elements.
```java
public List<List<Integer>> fourSum(int[] nums, int target) {
    int n = nums.length;
    Set<List<Integer>> set = new HashSet<>();

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                for (int l = k + 1; l < n; l++) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        Collections.sort(quad);
                        set.add(quad);
                    }
                }
            }
        }
    }

    return new ArrayList<>(set);
}
```

| Space | O(1)              |
|-------|-------------------|
| Time  | O(n<sup>4</sup> ) |

**[B] Optimal Solution: sorting and two pointers**
- we can sort the array and solve the two pointers problem to search last pair after fixing initial elements.
- just interate over the elements using loops and fix the initial two elements, then place two pointers at the
start and end. we can check if addition of numbers at these positions equates to the remaining target. If
target is greater then we should increament start or if target is small then we can decreament the end.
- we can form the quadruplets like this and keep adding them in result.

```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            long newTarget = (long) target - nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                newTarget = (long) target - nums[j] - nums[i];
                int left, right;
                left = j + 1;
                right = nums.length - 1;
                while (left < right) {
                    if (newTarget == (long) nums[right] + nums[left]) {
                        List<Integer> quadruplets = List.of(nums[i], nums[j], nums[left], nums[right]);
                        result.add(quadruplets);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    } else if (newTarget > nums[right] + nums[left]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
```

| Space | O(1) |
|-------|------------------|
| Time | O(n<sup>3</sup> ) |


