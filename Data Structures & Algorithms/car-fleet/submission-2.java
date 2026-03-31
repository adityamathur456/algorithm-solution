class Solution {

    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;
        int[][] pair = new int[n][2];

        // Store position and speed together
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        // Sort cars by position in descending order
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for (int[] p : pair) {

            double time = (double) (target - p[0]) / p[1];
            stack.push(time);

            // If current car catches up to the fleet ahead, merge them
            if (stack.size() >= 2 &&
                stack.peek() <= stack.get(stack.size() - 2)) {

                stack.pop();
            }
        }

        return stack.size();
    }
}
