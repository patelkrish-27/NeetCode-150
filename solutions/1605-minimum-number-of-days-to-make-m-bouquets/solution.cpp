class Solution {
public:
    int mnm(vector<int>& bloomDay, int n) {
        int min = 0;
        for (int i = 1; i < n; i++) {
            if (bloomDay[i] < bloomDay[min]) {
                min = i;
            }
        }
        return bloomDay[min];
    }
    int maxx(vector<int>& bloomDay, int n) {
        int maxx = 0;
        for (int i = 1; i < n; i++) {
            if (bloomDay[i] > bloomDay[maxx]) {
                maxx = i;
            }
        }
        return bloomDay[maxx];
    }
    int minDays(vector<int>& bloomDay, long m, long k) {

        long n = bloomDay.size();
        if (m * k > n) {
            return -1;
        }
        int count = 0, bouquet = 0;
        long low = mnm(bloomDay, n), high = maxx(bloomDay, n),
            mid = low + (high - low) / 2;
        while (low < high) {
            mid = low + (high - low) / 2;
            bouquet = 0, count = 0;
            for (int x = 0; x < n; x++) {
                if (mid >= bloomDay[x]) {
                    count++;
                } else {
                    bouquet += count / k;
                    count = 0;
                }
            }
            bouquet += count / k;
            cout << "low =" << low << "mid=" << mid << "high =" << high << endl;
            if (bouquet < m) {
                low = mid + 1;
            } else if (bouquet >= m) {
                high = mid;
            }
        }
        return low;
    }
};
