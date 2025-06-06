import java.util.*;
public class KthPalindrome {

    static boolean pal(String ans){
        String rev = new StringBuilder(ans).reverse().toString();
        return rev.equals(ans);
        
    }
    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();
        int x = 5;

        q.add("1");
        q.add("2");
        String ans = "";
        while(x>0){
            ans = q.remove();

            if(ans.length()%2==0 && pal(ans)) x--;

            if(ans.length()%2!=0){
            q.add(ans+1);
            q.add(ans+2);
            }else{
            String sub1= ans.substring(0,(ans.length()/2));
            String sub2 = ans.substring(ans.length()/2,(ans.length()));
            q.add(sub1+11+sub2);
            q.add(sub1+22+sub2);
            }
            
        }
        System.out.println(ans);
    }
}
