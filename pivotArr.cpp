#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() {
  int arr[] = {7,9,1,2,3};
  int n = sizeof(arr)/sizeof(arr[0]);

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
  cout<<"Pivot number is: "<<arr[s]<<" at index: "<<s;
}
