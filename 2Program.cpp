#include<iostream>
using namespace std;

class Demo
{
	public:
	void ChkSum(int[],int,int);
};

void Demo::ChkSum(int arr[],int No,int size)
{
	int i=0,j=0;
	for(i=0;i<size;i++)
	{
		for (j=i+1;j<size;j++)
		{
			if(No==(arr[i]+arr[j]))
			{
				cout<<arr[i]<<","<<arr[j];
				break;
			}
		}
	}
}


int main()
{
	int arr[]={10,-1,20,25,30},No=0;
	int size=sizeof(arr)/sizeof(arr[0]);
	
	cout<<"Required sum: ";
	cin>>No;
	Demo obj;

	obj.ChkSum(arr,No,size);

	return 0;
}