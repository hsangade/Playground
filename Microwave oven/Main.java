#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float items, heat;
  cin>>items>>heat;
  if(items<=2)
  {
    cout<<heat+(heat*0.5);
  }
  else if(items==3)
  {
    cout<<heat*2;
  }
  else
  {
    cout<<"Number of items is more";
  }
}