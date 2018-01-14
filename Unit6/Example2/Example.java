import java.util.Scanner;
public class Example
{
	public static void main(String args[])
	{
		Computer computer=new Computer();
		int m=0,n=0;
		Scanner reader=new Scanner(System.in);
		System.out.print("输入第一个数：");
		m=reader.nextInt();
		System.out.print("输入第二个数：");
		n=reader.nextInt();
		try
		{
			int r=computer.f(m,n);
			System.out.println(m+"和"+n+"的最大公约数:"+r);
			int t=computer.g(m,n);
			System.out.println(m+"和"+n+"的最小公倍数:"+t);
		}
		catch(NumberException el)
		{
			System.out.println(el.getMessage());
			System.out.print("输入第一个整数，必须是正整数，否则程序将退出:");
			m=reader.nextInt();
			System.out.print("输入第二个整数，必须是正整数，否则程序将退出:");
			n=reader.nextInt();
			try
			{
				int r=computer.f(m,n);
				System.out.println(m+"和"+n+"的最大公约数:"+r);
				int t=computer.g(m,n);
				System.out.println(m+"和"+n+"的最小公倍数:"+t);
			}
			catch(NumberException e2)
			{
				System.out.println("程序退出");
				System.exit(0);
			}
		}
	}
}