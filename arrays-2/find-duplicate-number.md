## Find the Duplicate Number

`Medium`

### PROBLEM
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.

### SOLUTION
**[A]using array/set/map**
- keep a an array/set/map that will keep track of occurance of all elements.
- moment you encounter a repeating element just return it.

|   Space   |   O(n)    |
|-----------|-----------|
|   Time    |   O(n)    |
