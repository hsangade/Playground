#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int x,y,w,s,n,profit,netpro,i=100;
  cin>>w;
  cin>>x;
  cin>>y;
   
  s = w * x ;
  n = w * y ;
  profit = s - n;
  netpro = profit - i;
  cout << netpro;
  
  
  return 0;
  
}