class Solution {
    int solve(int[] nums, int target, int s, int e){
        if(s>e){return -1;}
        int mid = s + (e-s)/2;
        if(nums[mid] == target){return mid;}
        if(nums[mid] < target) return solve(nums,target,mid+1,e);
        else{return solve(nums,target,s,mid-1);}
        
    }
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target){return 0;}
        if(nums.length==1){return -1;}
        int s = 0;
        int e = nums.length-1;
        return solve(nums,target,s,e);

    }
}
