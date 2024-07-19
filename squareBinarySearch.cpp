#include <iostream>
using namespace std;

double getPre(double tempSol, int pre,int target){
  double factor=1;
  double ans=tempSol;
  for(int i=0;i<pre;i++){
    factor/=10;
    for(double j=tempSol;j*j<target;j+=factor){
      ans=j;
    }
      
    }
  return ans;
  

}

int main() {
  int target = 37;
  int s = 0;
  int e = target;
  int pre = 3;
  while(s<e){
    int mid = s + (e-s)/2;
    cout<<mid<<endl;
    if(mid*mid==target){
      cout<<getPre(mid,pre,target);
      break;
    }else if(mid*mid>target){
      e=mid;
    }else if(mid*mid<target){
      s=mid+1;
    }
    
  }
}
