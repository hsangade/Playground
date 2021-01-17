#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int aw=75,cw=30,tw,ta,tc;
  cin>>tw>>ta>>tc;
  int tww=(aw*ta)+(cw*tc);
  if(tww<=tw)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}