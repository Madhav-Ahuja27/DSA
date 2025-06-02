

public class palindromeRecur {
      public static void main(String[] args){
        boolean[] flag = new boolean[1];
        flag[0] = true;
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int s = 0,e=arr.length-1;
        solve(arr,s,e,flag);

        System.out.println(flag[0]);
    }
    static void solve(int[] arr,int s, int e, boolean[] flag){
        if(s>=e){
            return;
        }
        if(arr[s]!=arr[e]){
            flag[0] = false;
            return;
        }
        solve(arr,s+1,e-1,flag);
    }
}
