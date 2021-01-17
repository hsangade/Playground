#include <iostream>
using namespace std;

int main() 
{
  int a,b,c,d,hcf,small;
  cin>>a>>b>>c>>d;
  if(a>b && a>c)
  {
    small=a;
  }
  else if(b>c && b>a)
  {
    small=b;
  }
  else
  {
    small=c;
  }
  while(small>=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
    {
      hcf=small;
      break;
    }
    small--;
  }
  if(hcf==d)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
}