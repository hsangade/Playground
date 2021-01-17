#include <iostream>
using namespace std;

int main() 
{
  int n1,n2,sum,div,count=0,i=1;
  cin>>n1>>n2;
  sum=n1+n2;
  while(i<sum)
  {
    div=sum%i;
    if(div==0)
      count=count+i;
    i++;
  }
  if(count==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}