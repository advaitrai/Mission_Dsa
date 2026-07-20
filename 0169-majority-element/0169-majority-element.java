class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ans = nums[0];
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                ans = nums[i];
            } else {
                count = 1;
                ans = nums[i];
            }

            if (count > n / 2) {
                return ans;
            }
        }

        return ans;
    }
}