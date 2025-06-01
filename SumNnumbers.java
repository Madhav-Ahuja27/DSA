import java.util.*;
public class SumNnumbers{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        int temp = sum(n-1);
        return temp+n;
    }
    
}