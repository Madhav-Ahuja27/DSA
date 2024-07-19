#include <iostream>
using namespace std;

bool checkGreater(int x, int y){
  if(x>y){
    return true;
  }
  return false;
}

int main() {
  // int arr[4] = {5, 10, 20, 15};
  int arr[5] = {15, 10, 20, 30, 40};
  int n = sizeof(arr)/sizeof(arr[0]);
 
  if(n==1){
    cout<<arr[0]<<endl;
  }
  if(arr[0]>arr[1]){
    cout<<arr[0]<<endl;
  }
  if(arr[n-1]>arr[n-2]){
    cout<<arr[n-1]<<endl;
  }

  
  for(int i=0;i<n;i++){
    if(checkGreater(arr[i], arr[i+1]) && checkGreater(arr[i], arr[i-1])){
      cout<<arr[i]<<endl;
    }
  }
}
