import java.util.*;

public class revFirstKQueue{
    public static Queue<Integer> solve(Queue<Integer> q, int k){

        Stack<Integer> s = new Stack<>();

        int len = q.size();
        int minus = len - k;

        for(int i=0;i<k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0;i<minus;i++){
            int temp = q.remove();
            q.add(temp);
        }
        return q;
    }

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        
        solve(q,4);
        while(q.size()>0){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
