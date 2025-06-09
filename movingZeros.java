class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int x: nums){
            if(x!=0){
                arr.add(x);
            }else{
                count++;
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i] = arr.get(i);
        }
        for(int i=arr.size();i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
