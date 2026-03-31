class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, 0, res);
        return res;
    }

    private void backTrack(int[] nums, int idx, List<List<Integer>> res) {
        if (idx == nums.length) {
            List<Integer> permuteList = new ArrayList<>();
            for (int num : nums) 
                permuteList.add(num);
            res.add(permuteList);
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            backTrack(nums, idx + 1, res);
            swap(nums, idx, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
