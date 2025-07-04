/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for(int i=0;i<=n;i++){
            if(isBadVersion(i)==true){return i;}
        }
        return -1;
    }
}
