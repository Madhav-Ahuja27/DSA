class Solution {
public:
    void sortColors(vector<int>& nums) {
       int n = nums.size();
       int i=0;
       int j=n-1;
       while(i<j){
        if((nums[i]==2 || nums[i]==1) && nums[j]==0){
            swap(nums[i],nums[j]);
            i++;
            j--;
        }else if(nums[i]==0){
            i++;
        }
        else if(nums[i]==2 && nums[j]==1){
            swap(nums[i],nums[j]);
        }
       }
    
    }
};
