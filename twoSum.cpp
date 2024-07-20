class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n=nums.size();
        
        vector<int> ok;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ok.push_back(i);
                    ok.push_back(j);
                    return ok;
                }
            }
        }
        return ok;
    }
    
};
