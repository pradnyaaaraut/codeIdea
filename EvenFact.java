import java.io.*;
import java.util.*;


class Fact
{
	public void Factorial(int iNo)
	{
		if(iNo<=0)
		{
			return;
		}
		if((iNo%2)!=0)
		{
			System.out.println("Even Factors not found");
			return;
		}

		for(int i=1;i<iNo;i++)
		{
			if((iNo%i)==0)
			{
				if((i%2)==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}


class EvenFact
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("\nEnter number: ");
		int Value=sobj.nextInt();

		Fact fobj=new Fact();
		fobj.Factorial(Value);
	}
}