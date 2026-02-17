## Pascal's Triangle

`Easy`

**PROBLEM**
Given an integer numRows, return the first numRows of Pascal's triangle.

**SOLUTION**
**(A) Approach Using Recursion**
Space Complexity: O(n)
Time Complexity: O(2<sup>n</sup>)
 - A function is written in a way that will compute the term by calling a recursive
 function that will call again the
 f(row, col)=1                                      if row=1 or row=column;
 f(row, col)=f(row-1, col-1) + f(row-1, col)        if row=1 or row=column;
 - calculating recursive function is has O(2<sup>n</sup>) time complexity, space required
 will be O(n<sup>2</sup>) as there will be no other space than creating the pascals triangle.

**(B) Approach Using Combinatorial Formula:**
Space Complexity: O(n^2)
Time Complexity: O(n^3)
 - Since at any position binomial coefficient of a pascals triangle can be calculated
 through formula,
 C(n,k) = C(n-1, k-1) + C(n-1, k)
 - factorial calculation can be done separately and it takes n operations to calculate
 a factorial of number.


**(C) Approach Using a previous row to genete the pascals triangle new row**
Space Complexity: O(n^2)
Time Complexity: O(n^2)
 - iteratively we will store the rows in triangle one by one and every new row will be calculated
 based on values generated in previous iteration.
 - space will be the triangle only and time required will depend on two for loops iterating through
 triangle.
```java
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        for (int i=0; i<n; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) row.add(1);
                else row.add(
                    triangle.get(i-1).get(j-1) +
                    triangle.get(i-1).get(j)
                );
            }
            triangle.add(row);
        }

        return triangle;
    }
}
```

**Applicable only when calculating single term in the triangle**
|       Approach	|    Time	|       Space       |
|-------------------|-----------|-------------------|
| Naive Recursion	|   O(2ⁿ)	|       O(n)        |
| Factorial         |   O(n³)   |	    O(n²)       |
| Iterative	        |   O(n²)	|       O(n²)       |
