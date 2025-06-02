import java.util.Scanner;
public class printToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("? ");
        int n = sc.nextInt();
        p(n);
        // System.out.println(rp(n,1));
        sc.close();
    }
    static void p(int n){
        if(n==0){
            return;
        }
        p(n-1);
        System.out.println(n);
    }
    static int rp(int n, int iter){
        if(iter==n){
            return n;
        }
        return rp(n,iter+1);
    }
}
