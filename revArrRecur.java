public class revArrRecur {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        rev(arr,0,arr.length-1);
        for(int x : arr){
            System.out.println(x);
        }
    }
    static void rev(int[] arr, int s, int e){
        if(s>=e) return;
        
        arr[s] += arr[e];
        arr[e] = arr[s]-arr[e];
        arr[s] -= arr[e];

        rev(arr,s+1,e-1);
    }
}
