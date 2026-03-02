## Pow(x, n)

`Medium`

### PROBLEM
Implement [pow(x, n)](http://www.cplusplus.com/reference/valarray/pow/), which calculates x raised to the power n (i.e., x^n).

### SOLUTION
**[A] Naive Solution: Using loop/recursion till n becomes zero**
- We can loop over n to 1 and keep multiplying the x*x
- at last we can use the output to compute for -n (if required)
```java
publc class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return n < 0 ? 1/result : result;
    }
}
```

|   Space   | O(1) |
|-----------|------|
|   Time    | O(n) |

**[B] Optimal Solution: Using loop/recursion till n becomes zero**
- In mathematics we can express x<sup>2n</sup> = (x<sup>2</sup>)<sup>n</sup> and similarly
x<sup>2n+1</sup> = x*(x<sup>2</sup>)<sup>n</sup>
- we can write recursive calls that will compute the above equation until n becomes zero.
```java
class Solution {

  public double power(double x, int n) {
    if (n == 0 || x == 1)
      return 1;
    if (n == 1)
      return x;
    return (n % 2 == 0) ? power(x * x, n / 2) : x * power(x * x, n / 2);
  }

  public double myPow(double x, int n) {
    return (n < 0) ? 1 / power(x, n) : power(x, n);
  }
}
```

|   Space   | O(1)    |
|-----------|---------|
|   Time    | O(logn) |

