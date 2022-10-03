/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // ? We come up with insertion sort approach taking advantage of the sorted arrays.
        int runner1 = m - 1;
        int runner2 = n - 1;
        int resultRunner = m + n - 1;

        // !  Consider each element `nums1[i]` of array `nums1` and ignore the element if it is already in the correct order; otherwise, swap it with the next smaller element, which happens to be the first element of `nums2`.

        while (runner1 >= 0 && runner2 >= 0) {
        // ! compare the current element of `nums1[]` with the first element of `nums2[]`
            if (nums1[runner1] > nums2[runner2]) {
                nums1[resultRunner] = nums1[runner1];
                runner1--;
            } else {
                nums1[resultRunner] = nums2[runner2];
                runner2--;
            }

            resultRunner--;
        }
        while (runner2 >= 0) {
            nums1[resultRunner] = nums2[runner2];
            runner2--;
            resultRunner--;
        }
    }
}
// @lc code=end
