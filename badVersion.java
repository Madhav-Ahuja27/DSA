/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    int solve(int s, int e){
        if(s>e){return -1;}
        int mid = s + (e-s)/2;
        if(isBadVersion(mid) == true && isBadVersion(mid-1)==false){
            return mid;
        }
        else if(isBadVersion(mid) == false){
            return solve(mid+1,e);
        }
        else{
            return solve(s,mid-1);
        }

    }

    public int firstBadVersion(int n) {
        int s = 0;
        int e = n;
        return solve(s,e);

    }
}
