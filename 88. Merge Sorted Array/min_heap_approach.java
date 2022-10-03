import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<m;i++){
            minHeap.add(nums1[i]);
        }
        
        for(int i=0;i<n;i++){
            minHeap.add(nums2[i]);
        }
        
        while(!minHeap.isEmpty()){
            for(int i=0;i<m+n;i++){
                nums1[i]=minHeap.remove().intValue();
            }
        }
    }
}
// @lc code=end

