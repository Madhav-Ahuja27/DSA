public class subsequenceRecur {
    public static void main(String[] args){
        char[] arr = {'a','j','k'};
        printSub(arr,0,arr.length-1);  
    }
    static void printSub(char[] arr, int s, int e){
        if(s>e) return;
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        printSub(arr, s+1, e);
        printSub(arr, s, e-1);
    }
}
