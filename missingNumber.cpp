#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // sorted(nums.begin(),nums.end());
        int n = nums.size()+1;
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
        }
        
        int no=(n*(n-1))/2;
        return no-sum;
    }
};
