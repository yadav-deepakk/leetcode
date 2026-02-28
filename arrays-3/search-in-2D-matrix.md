## Search a 2D Matrix

`Medium`

### PROBLEM
You are given an m x n integer matrix with the following two properties.
- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.

### SOLUTION
**[A] Naive Approach: Linear Search**
- We can use two for loops and search until the taget element is found.
```java
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
      for(int i=0; i<=matrix.length -1; i++) {
          for(int j=0; j<=matrix[0].length; j++) {
              if(matrix[i][j] == target) {
                  return true;
              }
          }
      }
      return false;
  }
}
```

| Space | O(1)    |
|-------|-----------|
| Time  | O(m*n)    |

**[B] Optimal Approach: Binary Search**
- Since matrix has already been sorted, we can take advantage of this condition.
- Binary Search is an algorithm that can be effective here, we can place two pointers
high and low at start and end respectively. Calculate the mid by adding these two values
and deviding it by two. check this position whether target is present or not. if present
then return true, else we can continue the search by using below two condition:
    - if target is smaller than the mid then just update the high value to mid -1.
    - else if target is present in second half of the array just update low value to mid + 1.
- You have to continue the search until low value is less or equals to the high.

```java
class Solution {
  public boolean binarySearchInMatrix(int[][] matrix, int target) {
    int m = matrix[0].length, n = matrix.length;
    int high=m*n -1, low=0;
    while (low < high) {
      int mid = low + (high - low) / 2;
      int r = mid / m;
      int c = mid % m;
      if (matrix[r][c] == target) return true;
      else if(matrix[r][c] < target) low = mid + 1;
      else high = mid - 1;
    }
    return false;
  }

  public boolean searchMatrix(int[][] matrix, int target) {
    return binarySearchInMatrix(matrix, target);
  }
}
```

| Space | O(1)          |
|-------|---------------|
| Time  | O(log(m*n))   |

