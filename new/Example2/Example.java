import java.util.Scanner;
public class Example
{
	public static void main(String args[])
	{
		Computer computer=new Computer();
		int m=0,n=0;
		Scanner reader=new Scanner(System.in);
		System.out.print("�����һ������");
		m=reader.nextInt();
		System.out.print("����ڶ�������");
		n=reader.nextInt();
		try
		{
			int r=computer.f(m,n);
			System.out.println(m+"��"+n+"�����Լ��:"+r);
			int t=computer.g(m,n);
			System.out.println(m+"��"+n+"����С������:"+t);
		}
		catch(NumberException el)
		{
			System.out.println(el.getMessage());
			System.out.print("�����һ������������������������������˳�:");
			m=reader.nextInt();
			System.out.print("����ڶ�������������������������������˳�:");
			n=reader.nextInt();
			try
			{
				int r=computer.f(m,n);
				System.out.println(m+"��"+n+"�����Լ��:"+r);
				int t=computer.g(m,n);
				System.out.println(m+"��"+n+"����С������:"+t);
			}
			catch(NumberException e2)
			{
				System.out.println("�����˳�");
				System.exit(0);
			}
		}
	}
}