#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  cin>>n;
  int x=n;
  cout<<n<<endl;
  while(x>1)
  {
  	if(x%2==0)
    {
      x=x/2;
      cout<<x<<endl;
      count++;
    }
    else
    {
      x=3*x+1;
      cout<<x<<endl;
      count++;
    }
  }
  cout<<count;
}