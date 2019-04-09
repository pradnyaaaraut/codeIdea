class Pattern7
{
	public void pattern7(int iRow)
	{
		int i=0,j=0,k=0,l=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=(iRow-i);j++)
			{
				System.out.print(" ");
			}

			for(k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			
			for(l=2;l<=i;l++)
			{
				System.out.print(l);
			}


			System.out.println();
		}

		for(i=iRow-1;i>=1;i--)
		{
			for(j=1;j<=(iRow-i);j++)
			{
				System.out.print(" ");
			}

			for(k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			
			for(l=2;l<=i;l++)
			{
				System.out.print(l);
			}


			System.out.println();
		}


		
	}
}


class Pattern8
{
	public void pattern8(int iRow)
	{
		int i=0,j=0,k=0;
		for(i=1;i<=iRow;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}

		for(i=1;i<=iRow-1;i++)
		{
			for(k=1;k<=iRow-i;k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
}


class Pattern9
{
	public void pattern9(int iRow)
	{
		int i=0,j=0,k=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iRow-i;j++)
			{
				System.out.print(" ");
			}

			
			for(k=1;k<=i;k++)
			{
				if(k>1)
				{
					System.out.print(" ");	
				}
			
				System.out.print(k);
			}
			
			System.out.println();
		}

		for(i=1;i<=iRow-1;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(k=1;k<=iRow-i;k++)
			{
				if(k>1)
				{
					System.out.print(" ");	
				}
			
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
}


class Pattern10
{
	public void pattern10(int iRow)
	{
		int i=0,j=0,k=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iRow-i;j++)
			{
				System.out.print(" ");
			}

			
			for(k=1;k<=i;k++)
			{
				if(k>1)
				{
					System.out.print(" ");	
				}
			
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}



class Pattern_36
{
	public static void main(String arg[])
	{
		Pattern7 p7obj=new Pattern7();
		p7obj.pattern7(4);

		Pattern8 p8obj=new Pattern8();
		p8obj.pattern8(4);

		Pattern9 p9obj=new Pattern9();
		p9obj.pattern9(4);

		Pattern10 p10obj=new Pattern10();
		p10obj.pattern10(4);


	}
}