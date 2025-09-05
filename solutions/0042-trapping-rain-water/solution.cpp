class Solution {
public:
    int trap(vector<int>& height) {
         int n = height.size();
        int sum = 0;
        int lm[n];
        int rm[n];
        int max = 0;
        for(int i = 0;i<n;i++){
           if(height[i]  > max){
               max =  height[i];
           }
           lm[i] = max;
        }
          max = 0;
          for(int i = n-1;i>=0;i--){
           if(height[i]  > max){
               max =  height[i];
           }
            rm[i] = max;
        }
        for (int i = 1; i < height.size()-1; i++){
        int wt = min(lm[i],rm[i]);
        if(wt-height[i] > 0){
         sum += wt-height[i];
            
        }
        }

        return sum;
    }
};
