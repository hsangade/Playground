#include<iostream>
using namespace std;
int main()
{
  int x,y,ss,gcd;
  cin>>x>>y;
  if(x<y)
  {
    ss=x;
  }
  else
  {
    ss=y;
  }
  while(ss>=1)
  {
    if(x%ss==0 && y%ss==0)
    {
      gcd=ss;
      break;
    }
    ss--;
  }
    cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<gcd;
}