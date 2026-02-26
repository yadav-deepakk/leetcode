## UNIQUE PATHS

`Medium`

### PROBLEM
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either
down or right at any point in time. Given the two integers m and n, return the number of possible unique
paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

### SOLUTION
**[A] Naive Approach**
- usign recursion and base condition will be when we reach to last cell. in that case just return 1.
- boundary cases will return zero as they are treated like wall, and will not take to goal cell.
- in other cases we need to look for other cell by moving a cell either towards right or down.
```java
class Solution {
    public int solve(int row, int col, int m, int n) {
        if (row==m-1 && col==n-1) return 1;
        if (row>=m || col>=n) return 0;
        return solve(row,col+1,m,n) + solve(row+1,col,m,n);
    }

    public int uniquePaths(int m, int n) {
        return solve(0, 0, m, n);
    }

}
```

|   Space | O(n+m)              |
|---------|---------------------|
|   Time  | O(2<sup>m+n</sup>)  |


**[B] Optimal Approach (using DP/memo array)**
- when we do recursive calls there are chances that we can land on the same cell via 2 or more routes, eg. a
cell can be approached by right turn or a down movement.
- There are chances that a cell which has already been computed for the unique paths, is getting called by
other calls and we will end up using more time to just calculate already calculated value.
- So in that case, we can just store the values in a memo. This memo will be checked in each call whether the
value is memoized or not.

```java
class Solution {
    public int solve(int row, int col, int m, int n, Integer[][] memo) {
        if (row>=m || col>=n) return 0;
        if (row==m-1 && col==n-1) return 1;
        if (memo[row][col] != null) return memo[row][col];
        int right = solve(row, col+1, m, n, memo);
        int down = solve(row+1, col, m, n, memo);
        memo[row][col] = right + down;
        return memo[row][col];
    }

    public int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[m][n];
        return solve(0, 0, m, n, dp);
    }
}
```

|   Space | O(n*m)     |
|---------|------------|
|   Time  | O(n*m)     |

