#include <iostream>
void swap(int *, int *);
using namespace std;

int main() 
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  swap(&a,&b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}
void swap(int *a, int *b)
{
  int t;
  t=*a;
  *a=*b;
  *b=t;
}