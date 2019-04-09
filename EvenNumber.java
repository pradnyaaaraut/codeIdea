import java.lang.*;
import java.io.*;
import java.util.*;

class Even
{
	public void DisplayEven(int iNo)
	{
		int iCnt=0,iAns=0;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			iAns=iCnt*2;
			System.out.println(iAns+"\n");
		}
	}
}

class EvenNumber
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("\nEnter Number :");
		int Value=sobj.nextInt();
		
		Even eobj=new Even();
		eobj.DisplayEven(Value);
	}
}