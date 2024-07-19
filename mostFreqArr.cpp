#include <iostream>
#include <bits/stdc++.h>
#include <algorithm>

using namespace std;
int main() {
  int arr[10]={1,2,3,3,4,4,4,5,6,7};
  int n=sizeof(arr)/sizeof(arr[0]);
  int m=arr[0];
  for(int i=0;i<n;i++){
    if(m<arr[i]){
      m=arr[i];
    }
  }
  int arr2[i]={0*m};
  // for(int i=0;i<n;i++){
  //   int x = arr[i];
  //   arr2[x]+=1;
  // }
  
}
