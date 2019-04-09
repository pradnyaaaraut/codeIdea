#include<stdio.h>
#include<stdlib.h>
void Seg(int*,int);

void main()
{
	int *brr,no=0;

	printf("Enter no of elements\n");
	scanf("%d",&no);

	brr=(int*)malloc(no*sizeof(int));

		for(int i=0;i<no;i++)
		{
			scanf("%d",&brr[i]);
		}
		
		Seg(brr,no);
		

		for(int i=0;i<no;i++)
		{
			printf("\n%d",brr[i]);
		}
	
}

void Seg(int arr[],int length)
{
	int Start=0,End=(length-1),Temp=0;
		
		while(Start<End)
		{
			while(((arr[Start]%2)==0)&&(Start<End))
			{
				Start++;
			}
		
			while(((arr[End]%2)!=0)&&(Start<End))
			{
				End--;
			}

			if(((arr[Start]%2)!=0)&&((arr[End]%2)==0))
			{
				Temp=arr[Start];
				arr[Start]=arr[End];
				arr[End]=Temp;
			}
		}
}



