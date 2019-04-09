import java.io.*;
import java.util.*;

class SNumber
{
	public void Swap(int iNo1,int iNo2)
	{
		int Temp=0;
		
		Temp=iNo1;
		iNo1=iNo2;
		iNo2=Temp;
		System.out.println("Swap:"+iNo1+","+iNo2);
	}
}


class SwapNumber
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("\nEnter 1st number: ");
		int Value1=sobj.nextInt();
			
		System.out.println("\nEnter 2nd number: ");
		int Value2=sobj.nextInt();

		SNumber obj=new SNumber();
		obj.Swap(Value1,Value2);
	
		//System.out.println("Largest Common Factor is:"+Ret);
	}
}