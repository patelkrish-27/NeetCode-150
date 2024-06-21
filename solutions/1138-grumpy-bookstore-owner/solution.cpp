class Solution {
public:
   int maxSatisfied(vector<int> &customers, vector<int> &grumpy, int minutes) {
  int winsum = 0, mwinsum = 0;
  int n = customers.size();
  int zerosum = 0;

  for (int i = 0; i < n; i++) {
    grumpy[i] == 0 ? zerosum += customers[i] : zerosum += 0;
  
    if (i < minutes) {
      winsum += grumpy[i]*customers[i];
    } else {
      winsum += (grumpy[i]*customers[i]) -
                (grumpy[i-minutes] * customers[i - minutes]);
    }
    mwinsum = max(mwinsum, winsum);
  }
  return zerosum + mwinsum;
}
};

