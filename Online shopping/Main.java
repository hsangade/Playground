#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int flipshirt, flipdiscount, flipship, flipfinal;
  int snapshirt, snapdiscount, snapship, snapfinal;
  int amazonshirt, amazondiscount, amazonship, amazonfinal;
  cin>>flipshirt>>flipdiscount>>flipship>>snapshirt>>snapdiscount>>snapship>>amazonshirt>>amazondiscount>>amazonship;
  flipfinal=flipshirt-(flipshirt*flipdiscount/100)+flipship;
  snapfinal=snapshirt-(snapshirt*snapdiscount/100)+snapship;
  amazonfinal=amazonshirt-(amazonshirt*amazondiscount/100)+amazonship;
  cout<<"In Flipkart Rs."<<flipfinal<<endl;
  cout<<"In Snapdeal Rs."<<snapfinal<<endl;
  cout<<"In Amazon Rs."<<amazonfinal<<endl;
  if(flipfinal<snapfinal && flipfinal<amazonfinal)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(snapfinal<flipfinal && snapfinal<amazonfinal)
  {
    cout<<"He will prefer Snapdeal";
  }
  else if(amazonfinal<flipfinal && amazonfinal<snapfinal)
  {
    cout<<"He will prefer Amazon";
  }
  else if(flipfinal==snapfinal)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(snapfinal==amazonfinal)
  {
    cout<<"He will prefer Snapdeal";
  }
  else if(flipfinal==amazonfinal)
  {
    cout<<"He will prefer Flipkart";
  }
}