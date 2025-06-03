import java.util.*;
public class subsetsTakeNotTake {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        ArrayList<String> ans = new ArrayList<>();
        solve(arr,ans,0,"");
        for(String str:ans){
            System.out.println(str);
        }
    }
    static void solve(int[] arr, ArrayList<String> ans, int indx, String temp){
        if(indx >= arr.length) {ans.add(temp); return;}

        solve(arr, ans, indx+1, temp+arr[indx]);
        solve(arr,ans,indx+1,temp);
        
        
    }
}
