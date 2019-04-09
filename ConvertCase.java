import java.io.*;
import java.util.*;
import java.lang.*;
class ChangeCase
{
	public void Convert(char cValue)
	{
		char ch;
		if((cValue>='A')&&(cValue<='Z'))
		{
			ch=cValue.toLowerCase(cValue);
			System.out.println(ch);
		}
		else if((cValue>='a')&&(cValue<='z'))
		{
			ch=cValue.toUpperCase(cValue);
			System.out.println(ch);
		}
	}
}


class ConvertCase
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("\nEnter character: ");
		char Value1=sobj.nextChar();

		ChangeCase obj=new ChangeCase();
		obj.Convert(Value1);
	}
}