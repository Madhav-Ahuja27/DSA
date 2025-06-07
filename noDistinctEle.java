import java.util.HashSet;

public class noDistinctEle {
    public static void main(String[] args){
        
        int arr[] = {5,5,5,5,1,2,3,4};
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        System.out.println(hs.size());
    }

}
