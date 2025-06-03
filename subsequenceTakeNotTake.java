import java.util.*;
public class subsequenceTakeNotTake {
     public static void main(String[] args){
        char[] arr = {'a','j','k'};
        // solve(arr,0,"");
        ArrayList<String> a = new ArrayList<>();
        
        solve(arr,0,"",a);
        Collections.sort(a);
        for(String str : a){
            System.out.println(str);
        }
    }
    // static void solve(char[] arr, int indx, String ans){
    //     if(indx>=arr.length) return;
    //     solve(arr,indx+1,ans);
    //     ans+=arr[indx];
    //     solve(arr,indx+1,ans);
        
    //     System.out.println(ans);
    // }
    static void solve(char[] arr, int indx, String ans, ArrayList<String> a){
        if(indx>=arr.length) return;
        solve(arr,indx+1,ans,a);
        ans+=arr[indx];
        solve(arr,indx+1,ans,a);
        
        a.add(ans);  
          
    }
}



// class Solution {
//      void solve(char[] arr, int indx, String ans, ArrayList<String> a){
//         if(indx>=arr.length) return;
//         solve(arr,indx+1,ans,a);
//         ans+=arr[indx];
//         solve(arr,indx+1,ans,a);
        
//         a.add(ans);  
          
//     }
//     public List<String> AllPossibleStrings(String s) {
//         // Code here
//         ArrayList<String> a = new ArrayList<>();
//         char[] arr = s.toCharArray();
//         solve(arr,0,"",a);
//         Collections.sort(a);
//         return a;
//     }
// }