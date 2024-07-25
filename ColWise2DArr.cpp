#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main() {
  // colm wise input
  int arr[3][4];
  for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 3; j++) {
      cin >> arr[j][i];
    }
  }
  for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 3; j++) {
      cout << arr[j][i] << " ";
    }
    cout << endl;
  }
}
