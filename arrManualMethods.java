import java.util.*;
public class arrayMethods{
    static void trav(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void update(int[] arr, int val, int indx){
        
        arr[indx] = val;
    }

    static void insert(int[] arr, int x){
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;

        System.out.println("Inserted");
    }

    static void delete(int[] arr, int ele){
        for(int i = ele;i<arr.length-1;i++){
            arr[i] = arr[i+1];

        }
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter query: ");
        boolean flag = true;
        while(flag==true){
        int n = sc.nextInt();
            switch(n){
                case 1: int x = sc.nextInt(); insert(arr,x); break;
                case 2: int ele = sc.nextInt(); delete(arr,ele); break;
                case 3: trav(arr); break;
                case 4: int val = sc.nextInt(); int indx = sc.nextInt(); update(arr,val,indx); break;
                default : flag=false; break;
            }
        }
        
    }
}
