## Best Time to Buy and Sell Stock

`Easy`

**Problem**
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want
to maximize your profit by choosing a single day to buy one stock and choosing a different day in
the future to sell that stock. Return the maximum profit you can achieve from this transaction. If
you cannot achieve any profit, return 0.

**Solution**
**[A] Naive approach using nested for loops**

| Time  | O(n<sup>2</sup>) |
|-------|------------------|
| Space | O(1)             |

- Place pointer at each element one by one and calculate the profit treating that element
as buy point. If the value of profit if greater than the existing value of the profit then
simply update the value.
- time and space complexity of given algorithm will be O(n<sup>2</sup>) and O(1) respectively.
```java
class Solution {

    // Brute force: O(n^2)
    public int maxProfitNaive(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {          // buy day
            for (int j = i + 1; j < prices.length; j++) {  // sell day
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
```

**[B] Kadane's Algorithm**
- In kadane's algorithm we try to calculate maximum sub array sum of a given array. In this algorith
we maintain total 2 variables `max_current` which stores the max sum upto current element and `max_global`
```java
class Solution {

    public int maxProfitOptimal(int[] prices) {
        int profit=0, minVal=prices[0];
        for (int price : prices) {
            minVal = Math.min(minVal, price);
            profit = Math.max(profit, price-minVal);
        }
        return profit;
    }

}
```
