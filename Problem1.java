// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void sortColors(int[] nums) {
        // take 3 pointer low -> 0, mid -> 1, high -> 2
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        // swap and check until mid crosses high
        // if zero encountered at mid/curr we swap with low and increment low and mid
        // if 1 encountered just increment mid as we considered mid to be 1
        // else 2 encountered swap mid and high and decrement high
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}