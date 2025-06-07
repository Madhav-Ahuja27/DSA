import java.util.*;
public class freqEle{
    public static void main(String[] args){
        int x = 5;
        int arr[] = {5,5,5,5,1,2,3,4};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele : arr){
            mp.put(ele,(mp.getOrDefault(ele, 0)+1));
        }
        System.out.println(mp.get(x));
    }
}