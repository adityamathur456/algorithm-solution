class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concatArr = new int[n * 2];

        for (int i = 0; i < n; i++) {
            concatArr[i] = concatArr[i + n] = nums[i];
        }
        
        return concatArr;
    }
}