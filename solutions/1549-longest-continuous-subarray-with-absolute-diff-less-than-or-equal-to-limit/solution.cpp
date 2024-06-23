class Solution {
public:
    int longestSubarray(vector<int>& nums, int limit) {
         int s =0 ,e = 0, n = nums.size(),ans = 0;
    deque<int> maxd;
    deque<int> mind;
    while(e<n){
        while(!maxd.empty() && nums[e] >= nums[maxd.back()]){
            maxd.pop_back();
        }
        maxd.push_back(e);
        while(!mind.empty() && nums[e] <= nums[mind.back()]){
            mind.pop_back();
        }
        mind.push_back(e);
        // cout<<"max ="<<maxd.front()<<"min="<<mind.front()<<endl;
        if(nums[maxd.front()] - nums[mind.front()]  > limit){
          s++;
          if(s>maxd.front()){
            maxd.pop_front();
          }
          if(s>mind.front()){
            mind.pop_front();
          }
          
        }else{
          // cout<<"s ="<<s<<"e="<<e<<endl;
          ans = max(ans, e-s+1);
          e++;
        }
    }
  return ans;
  }
};
