class Solution {
    public int lengthOfLastWord(String s) {
        String ans ="";
        s=s.trim();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp==' '){ans="";}
            else{ans+=temp;}
        }
        return ans.length();
    }
}
