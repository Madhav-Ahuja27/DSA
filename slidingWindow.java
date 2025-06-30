import java.util.*;

public class slidingWindow {
    public static void main(String[] args){
        int[] arr = {1,2,7,3,4,5,6};
        int k = 3;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                System.out.println("true");
                return;
            }
            hs.add(arr[i]);
            if(hs.size()>k){
                hs.remove(arr[i-k]);
            }
        }
        System.out.println("false");
    }
}
