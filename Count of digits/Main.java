#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,count;
  cin>>n;
  do
  {
    n=n/10;
    count++;
  }while(n>0);
  cout<<count;
}