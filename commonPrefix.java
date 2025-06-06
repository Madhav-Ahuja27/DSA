import java.util.*;
class Solution {
    String com(String s1,String s2){
        String ret = "";
        int len = Math.min(s1.length(),s2.length());
        for(int i=0;i<len;i++){
            if(s1.charAt(i)!=s2.charAt(i)) break;
            ret+=s1.charAt(i);
        }
        return ret;
    }
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];

        for(int i=1;i<strs.length;i++){
            String str1 = strs[i];
            
            ans = com(str1,ans);
        }
        return ans;
    }
}
