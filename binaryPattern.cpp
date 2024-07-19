#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() {
  int arr[] = {1,2,3,4,3,2,1};
  int n = sizeof(arr)/sizeof(arr[0]);

  int s=0;
  int e=n-1;
  while(s<e){
    int mid = (s+e)/2;
    if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
      cout<<"Number found "<<arr[mid];
      break;
    }else if(arr[mid]<arr[mid-1]){
      e=mid-1;
    }else{
      s=mid+1;
    }
  }
}
