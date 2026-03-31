class Solution {
    // List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, new ArrayList<>(), 0, nums, target, res);
        return res;
    }

    private void dfs(int i, List<Integer> curr, int total, int[] nums, int target, List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            if (total + nums[j] > target) return;
            curr.add(nums[j]);
            dfs(j, curr, total + nums[j], nums, target, res);
            curr.remove(curr.size() - 1);
        }
    }
}
