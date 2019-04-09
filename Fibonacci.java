import java.io.*;
import java.util.*;


class Fibo
{
	public void DisplayFibo(int iNo)
	{
		if(iNo<=0)
		{
			iNo=-iNo;
		}

		int iCnt=0,iSum1=0,iSum2=1,iAns=0;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			iAns=iSum1+iSum2;
			iSum1=iSum2;
			iSum2=iAns;
			System.out.println(iSum1);
		}
	}
}


class Fibonacci
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("\nEnter 1st number: ");
		int Value1=sobj.nextInt();

		Fibo fobj=new Fibo();
		fobj.DisplayFibo(Value1);
	}
}