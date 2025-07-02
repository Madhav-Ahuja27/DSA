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

    static int[] insert(int[] arr, int x, int pos){
        int[] res = new int[arr.length+1];
        
        for(int i=0;i<pos;i++){
            res[i] = arr[i];
        }
        res[pos] = x;
        for(int i=pos;i<arr.length;i++){
            res[i+1] = arr[i];
        }
        System.out.println("Inserted");
        return res;
    }

    static void delete(int[] arr, int ele){
        arr[ele] = 0;
        for(int i = ele;i<arr.length-1;i++){
            arr[i] = arr[i+1];

        }
        arr[arr.length-1] = 0;
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter query: ");
        boolean flag = true;
        while(flag==true){
        int n = sc.nextInt();
            switch(n){
                case 1 -> {
                    int x = sc.nextInt();int pos = sc.nextInt(); arr = insert(arr,x,pos);
                }
                case 2 -> {
                    int ele = sc.nextInt(); delete(arr,ele);
                }
                case 3 -> trav(arr);
                case 4 -> {
                    int val = sc.nextInt(); int indx = sc.nextInt(); update(arr,val,indx);
                }
                default -> flag=false;
            }
        }
        
    }
}
