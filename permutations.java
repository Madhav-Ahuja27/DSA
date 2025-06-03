class Solution {
    void solve(int[] arr,List<List<Integer>> ans, int i){
        if(i >= arr.length){
            ArrayList<Integer> mini = new ArrayList<>();
            for(int x:arr){
                mini.add(x);
            }
            ans.add(mini);
        }

        for(int j=i;j<arr.length;j++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            solve(arr,ans,i+1);

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,ans,0);
        return ans;
    }
}
