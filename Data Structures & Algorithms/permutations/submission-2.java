class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permuteList = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), permuteList);
        return permuteList;
    }

    private void backtrack(int idx, int[] nums, List<Integer> currPermutation,List<List<Integer>> permuteList) {
        if (idx == nums.length) {
            permuteList.add(new ArrayList<>(currPermutation));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            currPermutation.add(nums[i]);
            swap(nums, idx, i);
            backtrack(idx + 1, nums, currPermutation, permuteList);
            swap(nums, idx, i);
            currPermutation.remove(currPermutation.size() - 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
