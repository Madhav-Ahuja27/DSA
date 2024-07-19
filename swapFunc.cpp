#include <iostream>
#include <vector>
using namespace std;
void swap(vector<int>& nums, int i, int j){
  int x=nums[i];
  nums[i]=nums[j];
  nums[j]=x;
}
int main() {
  vector<int> nums = {3,1,-2,-5,2,-4};
  int n=nums.size();

      
  swap(nums,0,1);
  for(int i=0;i<n;i++){
    if(nums[i]<0){
      cout<<nums[i]<<endl;
    }
    
  }
  
}
