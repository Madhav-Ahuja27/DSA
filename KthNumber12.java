import java.util.*;
public class KthNumber12{
    public static void main(String[] args){
        int x = 7;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        int temp=0;
        for(int i=0;i<x;i++){
            temp = q.remove();
            q.add((temp*10)+1);
            q.add((temp*10)+2);
        }
        System.out.println(temp);
    }
}
