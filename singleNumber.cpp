#include <bits/stdc++.h>
#include <algorithm>

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if(nums.size()==1){
            return nums[0];
        }
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]!=nums[i+1] && nums[i+1]!=nums[i+2]){
                return nums[i+1];
            }
        }
        return nums[0];
    }
};
