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
		System.out.print("������������������");
		Scanner reader=new Scanner(System.in);
		int a,b,m;
		a=reader.nextInt();
		b=reader.nextInt();
		C c=new C();
		D d=new D();
		m=c.f(a,b);
		System.out.println("\n"+a+"��"+b+"�����Լ��Ϊ��"+m);
		m=d.f(a,b);
		System.out.println(a+"��"+b+"����С������Ϊ��"+m);
	}
}
		
		
			