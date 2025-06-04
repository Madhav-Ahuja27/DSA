class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='(' || temp=='[' || temp=='{') {st.push(temp);}
            else{
                char get;
                if(temp==')') {get='(';}
                else if(temp==']') {get='[';}
                else {get='{';}

                if(st.size()>0 && st.peek()==get) st.pop();
                else{return false;}
            }
        }






        if(st.size()>0) return false;
        return true;
    }
}
