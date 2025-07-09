class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int len = n1+n2;
        int[] res = new int[len];

        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            res[k++] = nums1[i]>nums2[j] ? nums2[j++]:nums1[i++];
        }
        while(i<n1){
            res[k++] = nums1[i++];
        }
        while(j<n2){
            res[k++] = nums2[j++];
        }
        double ans = 0;
        if(len%2!=0){
            ans= res[(len)/2];
        }
        ans = (double)(res[len/2] + res[(len-1)/2])/2;
        return ans;
    }
}
