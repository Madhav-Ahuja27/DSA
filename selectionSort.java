public class selectionSort {
    public static void main(String[] args){
        int arr[] = {9,8,7,6,5,4};

        for(int i=0;i<arr.length-1;i++){
            int smol = i;
            for(int j=i;j<arr.length;j++){
                if(arr[smol] > arr[j]){smol=j;}
            }
            int temp = arr[i];
            arr[i] = arr[smol];
            arr[smol] = temp;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
