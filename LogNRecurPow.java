import java.util.Scanner;

public class LogNRecurPow {
     public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        
        System.out.println("? ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(pow(n,p));
        sc.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    static int pow(int n, int p){
        if(p==1||p==0){
            return n;
        }
        int temp=p%2==0?pow(n,p/2)*pow(n,p/2):pow(n,p/2)*pow(n,p/2)*n;
        return temp;
    }
}
