#include<iostream>
using namespace std;
int main()
{
  int n,evensum=0,oddsum=0;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
  {
    cin>>arr[i];
  }
  for(int i=0; i<n; i++)
  {
    if(arr[i]%2==0)
      evensum=evensum+arr[i];
    else
      oddsum=oddsum+arr[i];
  }
  cout<<"The sum of the even numbers in the array is "<<evensum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<oddsum;
}