#include <iostream>
using namespace std;

int main() 
{
  int mw,wf;
  cin>>mw>>wf;
  if(mw>wf)
    cout<<"Yes, you can enter.";
  else if(mw==wf)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  
}