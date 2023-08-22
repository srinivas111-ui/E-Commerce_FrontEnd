import java.util.*;
class kl
{
	public static void main(String args[])
	{
		try{
			int a=12;
			int b=0;
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try{
			Scanner sc=new Scanner(System.in);
			int a=12;
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}