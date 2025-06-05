class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(s1.size()!=1){
            int temp = s1.pop();
            s2.push(temp);
        }
        int ans = s1.pop();
        while(!s2.isEmpty()){
            int temp = s2.pop();
            s1.push(temp);
        }
        return ans;
    }
    
    public int peek() {
        while(s1.size()!=1){
            int temp = s1.pop();
            s2.push(temp);
        }
        int ans = s1.peek();
        while(!s2.isEmpty()){
            int temp = s2.pop();
            s1.push(temp);
        }
        return ans;
    }
    
    public boolean empty() {
        boolean flag = s1.isEmpty();
        return flag;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
