public class sortedRecur {

    static boolean solve(int[] arr, int a, int b){
        if(arr.length<=b) return true;
        if(arr[a] > arr[b]){return false;}
        return solve(arr,a+1,b+1);
        
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        
        System.out.println(solve(arr,0,1));
    }
}
