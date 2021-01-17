#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrolavailable, distancetotravel,pd;
  cin>>mileage>>petrolavailable>>distancetotravel;
  pd=petrolavailable*mileage;
  if (pd >= distancetotravel)
  {
    std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
  }
}