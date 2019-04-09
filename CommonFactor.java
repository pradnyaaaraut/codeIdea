import java.io.*;
import java.util.*;


class Fact
{
	public void CommonFact(int iNo1,int iNo2)
	{
		if(iNo1<=0)
		{
			iNo1=-iNo1;
		}
		if(iNo2<=0)
		{
			iNo2=-iNo2;
		}

		int iCnt=2;
		while((iCnt<=iNo1)&&(iCnt<=iNo2))
		{
			if(((iNo1%iCnt)==0)&&((iNo2%iCnt)==0))
			{
				System.out.println("Common Factor is:"+iCnt);
			}
			iCnt++;
		}
	}
}


class CommonFactor
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("\nEnter 1st number: ");
		int Value1=sobj.nextInt();
			
		System.out.println("\nEnter 2nd number: ");
		int Value2=sobj.nextInt();

		Fact fobj=new Fact();
		fobj.CommonFact(Value1,Value2);
	}
}