
public class subsetSum {
     public static void main(String[] args){
        int[] arr = {3,34,4,12,5,2};
        boolean[] flag = new boolean[1];
        solve(arr,0,"",30,flag);
        System.out.println(flag[0]);
    }
    static void solve(int[] arr, int indx, String temp, int ques, boolean[] flag){
        if(indx >= arr.length) {
            int sum = 0;
            for(int i=0;i<temp.length();i++){
                sum += (temp.charAt(i)-'0');
            }
            if(sum == ques) flag[0]=true;
            return;
            }

        solve(arr, indx+1, temp+arr[indx],ques,flag);
        solve(arr,indx+1,temp,ques,flag);
        
    }
}
