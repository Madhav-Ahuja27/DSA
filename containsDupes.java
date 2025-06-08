import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        return !(nums.length==hs.size());
    }
}
