#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int regnum,even=0,odd=0;
  cin>>regnum;
  int i=regnum;
  while(i>0)
  {
    int digit=i%10;
    i=i/10;
    if(digit%2==0)
    {
      even=even+digit;
    }
    else
    {
      odd=odd+digit;
    }
  }
  if(odd==even)
    cout<<"Yes";
  else
    cout<<"No";
}