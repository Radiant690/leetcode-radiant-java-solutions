/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        // ? Intuition :: What if the num was a character array, with ease of access of specific index. We can convert the given num into an char array and iterate over it. We now simply look for the conditional whether the particular index value is 6 then assign it to 9 and break the logic there.

        char num_arr[] = String.valueOf(num).toCharArray();

        for(int i = 0; i< num_arr.length; i++)
    }
}
// @lc code=end

