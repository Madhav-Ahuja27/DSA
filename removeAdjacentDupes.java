import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(st.size()>0){
                if(st.peek()==temp){
                    st.pop();
                }else{
                    st.push(temp);
                }
            }else{
                st.push(temp);
            }
        }
        String ans = "";
        while(st.size()>0){
            ans+=st.peek();
            st.pop();
        }
        ans = new StringBuilder(ans).reverse().toString();
        return ans;
    }
}
