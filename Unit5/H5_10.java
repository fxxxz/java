import java.util.Scanner;
class C
{
	public int f(int a,int b)
	{
		int m;
		if(a>b)
		{
			for(m=b;;m--)
			{
				if(a%m==0&&b%m==0)
				{
					break;
				}
			}
			return m;
		}
		else
		{
			for(m=a;;m--)
			{
				if(b%m==0&&a%m==0)
				{
					break;
				}
			}
			return m;
		}
	}
}
class D extends C
{
	public int f(int a,int b)
	{
		int m;
		m=super.f(a,b);
		return a*b/m;
	}
}
public class H5_10
{
	public static void main(String args[])
	{
		System.out.print("请输入两个正整数：");
		Scanner reader=new Scanner(System.in);
		int a,b,m;
		a=reader.nextInt();
		b=reader.nextInt();
		C c=new C();
		D d=new D();
		m=c.f(a,b);
		System.out.println("\n"+a+"和"+b+"的最大公约数为："+m);
		m=d.f(a,b);
		System.out.println(a+"和"+b+"的最小公倍数为："+m);
	}
}
		
		
			