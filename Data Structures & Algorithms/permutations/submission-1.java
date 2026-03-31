class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permuteList = new ArrayList<>();
        backtrack(0, nums, permuteList);
        return permuteList;
    }

    private void backtrack(int idx, int[] nums, List<List<Integer>> permuteList) {
        if (idx == nums.length) {
            List<Integer> currPermutation = new ArrayList<>();
            for (int num : nums) currPermutation.add(num);
            permuteList.add(currPermutation);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            backtrack(idx + 1, nums, permuteList);
            swap(nums, idx, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
