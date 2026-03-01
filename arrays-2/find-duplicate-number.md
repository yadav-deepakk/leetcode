## Find the Duplicate Number

`Medium`

### PROBLEM
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.

### SOLUTION
**[A] Naive Approach: using array/set/map**
- keep a an array/set/map that will keep track of occurance of all elements.
- moment you encounter a repeating element just return it.
```java
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            boolean success = set.add(nums[i]);
            if(!success) return nums[i];
        }
        return -1;
    }
}
```

|   Space   |   O(n)    |
|-----------|-----------|
|   Time    |   O(n)    |

**[B] Optimal Approach**
- We can use same array positions to keep track of all elements. Once an element is encountered we can mark
index(location) equivalent to number in array as negative. appeared with a negative sign to that position.
- Moment we encounter any number, whos position was already negative marked by us will be a duplicate number.
In that case we can just return that number.

```java
class Solution {
    public int findDuplicate(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int number = Math.abs(nums[i]);
            if(nums[number-1] > 0) nums[number-1] *= (-1);
            else return number;
        }
        return -1;
    }
}
```

|   Space   |   O(1)    |
|-----------|-----------|
|   Time    |   O(n)    |

