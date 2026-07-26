class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        // Deque<Integer> ms = new ArrayDeque<>();
        int[] stack = new int[n];
        int top = -1;
        for(int i = 0;i<n;i++){
            while(top != -1 && temperatures[stack[top]] < temperatures[i] ){
                int index = stack[top--];
                ans[index] = i - index;
            }
            stack[++top] = i;
        }
        return ans;
    }
}
