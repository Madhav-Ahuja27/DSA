import java.util.HashMap;

public class firstNonRepeating {
     public static void main(String[] args){
        
        int arr[] = {5,5,5,5,1,1,1,1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele : arr){
            mp.put(ele,(mp.getOrDefault(ele, 0)+1));
        }
        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i]) == 1) {System.out.println(arr[i]);return;}
        }
        System.out.println(-1);
    }
}
