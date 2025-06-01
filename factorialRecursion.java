
import java.util.Scanner;

public class factorialRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("? ");
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int temp1 = fact(n-1);
        int temp2 = fact(n-2);
        return temp1+temp2;
        
    }
}
