/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number(int num) {
        // ? Intuition :: We can easily say that our goal is to find the first 6 within
        // num because all 9 would be maximum (9999) and any 6 present will be needed to
        // change like 6999, 9699, 9969 to make it the maximum with atmost one change.
        String sol = new String(num + "");
        sol = sol.replaceFirst("[6]", "9");
        return Integer.parseInt(sol);
    }
}
// @lc code=end
