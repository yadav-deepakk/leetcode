## Sort Colors(0s-1s-2s)

`Medium`

**Problem**
Given an array nums with n objects colored red, white, or blue, sort them in-place so that
objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

**Solution:**
**[A] Approach using conventional sorting:**
Space: O(n)
Time: O(n<sup>2</sup>)
 - using any of conventional sorting algorithms can give you either O(nlogn) or O(n<sup>2</sup>).
 bubble, selection, insertion or similar will compare values pass by pass and sort at the end.
 merge and quick sort will devide the array and apply the sorting by parts recursively so they
 are little efficient in terms of time but still have nlong time complexity.

**[B] counting and arranging them:**
Space: O(n)
Time: O(n)
 - just take a look at all element and in pass one just iterate and count them.
 - in next pass make modifications to all positions
 ```java
class Solution {
    public void sortColors(int[] nums) {

        // counting the elements
        int zeros=0, ones=0, twos=0;
        for (int n: nums){
            switch(n){
                case 0: zeros++; break;
                case 1: ones++; break;
                case 2: twos++; break;
                default: System.out.println("Invalid Number.");
            }
        }

        // making modifications to existing array
        int i=0;
        while(zeros-->0) nums[i++] = 0;
        while(ones-->0) nums[i++] = 1;
        while(twos-->0) nums[i++] = 2;

    }
}
 ```
