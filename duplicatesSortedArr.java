class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for(int i: nums){
            s.add(i);
        }
        int x = 0;
        for(int ele : s){
            nums[x] = ele;
            x++;
        }
        
        return s.size();
    }
}
