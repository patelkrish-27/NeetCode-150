class Solution {
public:
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit,
                            vector<int>& worker) {
        int n = difficulty.size();
        int m = worker.size();
        int i = 0, j = 0;
        int Mprofit = 0;

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (profit[i] > profit[j]) {

                    int temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;

                    int temp1 = difficulty[i];
                    difficulty[i] = difficulty[j];
                    difficulty[j] = temp1;

                    // swap(profit[i], profit[j]);
                    // swap(difficulty[i], difficulty[j]);
                }
            }
        }

        for (j = 0; j < m; j++) {
            for (i = n - 1; i >= 0; i--) {
                if (worker[j] >= difficulty[i]) {
                    Mprofit += profit[i];
                    break;
                }
            }
        }
        return Mprofit;
    }
};
