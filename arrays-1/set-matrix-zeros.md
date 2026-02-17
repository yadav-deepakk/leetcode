## Set Matrix Zeroes
`Medium`

**PROBLEM:**
Given an `m x n` integer matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

**SOLUTION:**
**A) without doing in place**
 - using a map to store row where zero found and similarly for column where the zero was found
Complexities:
Space: O(n + m)
Time: O(n * m)

```java
class Solution {

    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        // take a note of column and row where 0 were found
        for (int i = 0; i < matrix.length; i++)
        for (int j = 0; j < matrix[0].length; j++)
        if (matrix[i][j] == 0) {
            rows.add(i);
            cols.add(j);
        }

        // replacing all rown and column values to zero
        // where we found zeros
        for (int i = 0; i < matrix.length; i++)
        for (int j = 0; j < matrix[0].length; j++)
        if (rows.contains(i) || cols.contains(j)) {
            matrix[i][j] = 0;
        }
    }

}
```

**B) Doing in place**
    - we are going to traverse the matrix twice for (i) marking rows, cols which has zeros and (ii) replacing
    the non-zero values.
    - we will be using first column as a marker and place a zero for each row if there is a zero found in row
    and similarly first row as marker to the column
    - so we will need a flag `zeroInFirstCol` and set it if zero found in first column, as we will loose the
    track if actually first column had a zero or not.
    - since we will traverse the matrix backwards in next traverse that is why we will not need any such variable
    for the matrix again.

Complexities:
Space: O(1)
Time: O(n * m)
```java
 class Solution {

    // Space: O(1)
    public void setZeroes(int[][] matrix) {
        boolean zeroInFirstCol = false;

        for (int i=0; i<matrix.length; i++) {
            if(matrix[i][0]==0) zeroInFirstCol=true;
            for (int j=1; j<matrix[0].length; j++) {
                if (matrix[i][j]==0) {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for (int i=matrix.length-1; i>=0; i--) {
            for (int j=matrix[0].length-1; j>=1; j--) {
                if (matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
            if(zeroInFirstCol) matrix[i][0]=0;
        }

    }

}
```


