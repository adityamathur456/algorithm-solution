class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, new ArrayList<Integer>(), 0, candidates, res, target);
        return res;
    }

    private void dfs(int idx, ArrayList<Integer> curr, int currSum, int[] nums, List<List<Integer>> res, int target) {
        if (currSum == target) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
            if (currSum + nums[i] > target) break;
            curr.add(nums[i]);
            dfs(i + 1, curr, currSum + nums[i], nums, res, target);
            curr.remove(curr.size() - 1);
        }
    }
}
