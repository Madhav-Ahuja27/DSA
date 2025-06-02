class Solution {
    boolean solve(String str, int s, int e){
        if(s>=e) return true;
        if(str.charAt(s)!=str.charAt(e)) return false;
        return solve(str,s+1,e-1);
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str = Integer.toString(x);
        int s = 0, e = str.length()-1;
        return solve(str,s,e);
    }
}
