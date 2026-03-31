class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

        for (int num : nums) 
            maxHeap.offer(num);

        int res = 0;
        while (!maxHeap.isEmpty() && k != 0) {
            res = maxHeap.poll();
            k--;
        }

        return res;
    }
}
