import java.util.Arrays;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // ? Brute force approach : Here we simply take the elements of num2 and insert in num1. Finally we sort the num1 array.

        for(int i = 0; i< n; i++){
            // ! Inserting the nums2 array values into nums1 array.
            nums1[m+i]= nums2[i];
        }

        Arrays.sort(nums1);
        // ** Time complexity : Time needed would be traversal cost of nums2 array # O(n) and Sorting cost of nums1 # O(log(m)) so the resultant cost is O((n)*log(m))
    }
}
// @lc code=end

