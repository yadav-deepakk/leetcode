## Rotate Image(2D matrix)

`Medium`

### PROBLEM
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image [in-place](https://en.wikipedia.org/wiki/In-place_algorithm), which means
you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

### SOLUTION
**[A] Using Extra Space**
Space: O(n<sup>2</sup>)
Time: O(n<sup>2</sup>)
- We will traverse through the row and place them in corresponding last column one by one.
- Problem with this approach is extra space, resulting matrix is going to be a new matrix
and we can improve this apprach further
```java
class Solution {
  public void rotate(int[][] matrix) {
    int n = matrix.length;
    int[][] rotated = new int[n][n];

    // Naive rotation (using extra matrix)
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        rotated[j][n - 1 - i] = mat[i][j];
      }
    }

  }
}
```

**[B] doing it in-place**
Space: O(1)
Time: O(n<sup>2</sup>)
- First we are going to take the transpose of the matrix (Aij = Aji), since matrix is a square matrix
result will also be a square matrix.
- At the time of doing the transpose we'll flip the matrix around the diagonal of matrix.
ie when we will do transpose we have to keep condition i < j.
- After taking the transpose the new matrix will become quite similar to result only columns are not at
places where we actually want them, so to do it we will iterate through the matrix and keep swapping elements
with the respective column element.
```java
class Solution {
  public void rotate(int[][] matrix) {

    // take transpose of matrix (i.e. Aij = Aji)
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // swapping the column
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length / 2; j++) {
        int last = matrix[0].length - 1 - j;
        int temp = matrix[i][last];
        matrix[i][last] = matrix[i][j];
        matrix[i][j] = temp;
      }
    }

  }
}
```
