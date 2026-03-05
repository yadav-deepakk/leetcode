## Majority Element II

`Medium`

### PROBLEM
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

### SOLUTION
**[A] Naive Approach: Using of a map**
- We can use a map and keep count of occurance of each element.
- At last we can iterate over map and keep look for the elements having occurance more
than n/3 times.
- Form a list of those elements and just return it.

| Space | O(1) |
|--------|-----|
| Time | O(n) |

**[B] Optimal Approach: Moore's voting algorithm**
- As we know that if n/3 is requirement for occurance then only 2 elements can be found of
type. because if 2 elements appear (n/3)+ times then there is no scope left for 3rd element.
- we can simiply use two candidates variable and try to set off their occurance with other
elements in the array. Due to dominance of these elements only they will be left at last.
- since question don't state that they are mandatorily present in the array or not. There
occurance can be tesed at last.

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }
}
```

| Space | O(1) |
|--------|-----|
| Time | O(n) |
