class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int i = 0;
        int j = n-1;

        for(int x=n-1;x>=0;x--){
// res[i] = Math.abs(nums[i]) < Math.abs(nums[j]) ? nums[j]*nums[j];j--;:nums[i]*nums[i];i++;
        if(Math.abs(nums[i]) < Math.abs(nums[j])){
            res[x] = nums[j]*nums[j];
            j--;
        }else{
            res[x]=nums[i]*nums[i];
            i++;
        }
        }
        return res;
    }
}
