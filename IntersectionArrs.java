class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums1){
            hs.add(i);
        }
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i:nums2){
            if(hs.contains(i)){
                hs2.add(i);
            }
        }
        int[] arr = new int[hs2.size()];
        int idx = 0;
        for(int i:hs2){
                arr[idx] = i;
                idx++;
            
        }

        return arr;
    }
}
