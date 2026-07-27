class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet = 0;
        double prev = 0;
        double req = 0;
        int n = speed.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(position[i], i);
        }
        Arrays.sort(position);
        for (int i = 0, j = position.length - 1; i < j; i++, j--) {
            int temp = position[i];
            position[i] = position[j];
            position[j] = temp;
        }
        for (int i = 0; i < n; i++) {
            req = (float) (target - position[i]) / (double) speed[map.get(position[i])];
            if (req > prev) {
                fleet++;
                prev = req;
            }
        }
        return fleet;
    }
}
