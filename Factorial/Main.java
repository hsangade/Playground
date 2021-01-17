#include<iostream>
using namespace std;
void fact(int);
int main()
{
  int n;
  cin>>n;
  fact(n);
}
void fact(int x)
{
  int fact=1;
  for(int i=1;i<=x;i++)
  {
    fact=fact*i;
  }
  cout<<"The factorial of "<<x<<" is "<<fact;
}