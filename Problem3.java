// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;

        while(i < j){

            int min = Math.min(height[i],height[j]);
            max = Math.max(max, min*(j-i));

            // we inc/dec i or j value based on smaller value
            if(height[i] < height[j])
                i++;
            else
                j--;
        }

        return max;
    }
}