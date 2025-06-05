import java.util.*;
class MinStack {
    Stack<Integer> frst = new Stack<>();
    Stack<Integer> scnd = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        frst.push(val);
        if(!scnd.isEmpty()){
            scnd.push(Math.min(val,scnd.peek()));
        }else{
        scnd.push(val);
        }
    }
    
    public void pop() {
        frst.pop();
        scnd.pop();
    }
    
    public int top() {
        return frst.peek();
    }
    
    public int getMin() {
        return scnd.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
