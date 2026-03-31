class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int a = nums[i];

            if (a > 0 ) break;
            if (i > 0 && a == nums[i - 1]) continue;

            int l = i + 1, r = n - 1;

            while (l < r) {
                int sum = a + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                }
                else if (sum < 0) {
                    l++;
                }
                else {
                    res.add(Arrays.asList(a, nums[l], nums[r]));
                    l++;
                    r--;
                    
                    while (l < r && nums[l] == nums[l - 1]) 
                        l++;
                }
            }
        }

        return res;
    }
}
