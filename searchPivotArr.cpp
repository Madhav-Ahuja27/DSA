#include <iostream>
using namespace std;

int getPivot(int arr[],int n;){
  int s=0;
  int e=n-1;
  while(s<e){
    int mid = s + (e-s)/2;
    if(arr[mid]>arr[0]){
      s=mid+1;
    }else{
      e=mid;
    }
  }
}
int main() {
  int arr[] = {7,9,1,2,3};
  int n=sizeof(arr)/sizeof(arr[0]);
  int target = 9;

  int s=0;
  int e=n-1;
  int mid = s + (e-s)/2;
  


  
  while(s<e){
    
  
    if(target>getPivot(arr,n) && target>){
      cout<<"Target "<<arr[mid]<< "found at index: "<<mid;
    }else if(target>arr[0]){
      e=mid;
    }else if(target<arr[n-1]){
      s=mid;
    }else if(arr[mid])
  }
}
