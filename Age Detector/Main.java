#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int currentyear, birthyear, age;
  cin>>birthyear>>currentyear;
  if(currentyear<birthyear)
  {
    int temp=currentyear+100;
    age=temp-birthyear;
    cout<<age;
  }
  else
    cout<<currentyear-birthyear;
}