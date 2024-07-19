#include <iostream>
using namespace std;
int main() {
  int arr[4]= {3,4,-1,1};
  int n=sizeof(arr)/sizeof(arr[0]);

  int i=0;
  int j=n-1;
 
  while(i<j){
    if(arr[i]>0 && arr[j]<0){
      swap(arr[i],arr[j]);
      i++;
      j--;
    }else if(arr[i]>0){
      j--;
    }else if(arr[j]<0){
      i++;
    }else if(arr[i]<0 && arr[j]>0){
      i++;
      j++;
    }
  }
  for(int i=0;i<n;i++){
    cout<<arr[i]<<endl;
  }
}
