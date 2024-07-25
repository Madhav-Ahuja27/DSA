#include <iostream>
using namespace std;
#include <bits/stdc++.h>
int main() {
  int arr[3][3] = {{3, 4, 11}, {2, 12, 1}, {7, 8, 7}};

  int max=0;
  for (int i = 0; i < 3; i++) {
    int sum = 0;
    for (int j = 0; j < 3; j++) {
      sum += arr[i][j];
    }
    if(sum>max){
      max=sum;
    }
  }

  cout << max << " ";
}
