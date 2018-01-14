import java.util.Scanner;
public class ExpressionType
{
	public static void main(String args[])
	{
		int n=0;
		double x=0,y=0;
		byte p=7,q=-8;
		long a=1,b=100;
		Scanner reader=new Scanner(System.in);
		System.out.println("计算5/2+x+n%3+x/(x+y)");
		System.out.print("输入变量n的值：");
		n=reader.nextInt();
		System.out.print("输入变量x的值：");
		x=reader.nextDouble();
		System.out.print("输入变量y的值：");
		y=reader.nextDouble();
		double resultOne=5/2+x+n%3+x/(x+y);
		System.out.println("5/2+x+n%3+x/(x+y)="+resultOne);
		long resultTwo=(a=15)/(b=5)+(a>b?a:b);
		System.out.println("(a=15)/(b=5)+(a>b?a:b)="+resultTwo);
		int resultThree=(p&q)+(p|q)+(~p)+(p^3^3);
		System.out.println("p&q="+(p&q));
		System.out.println("p|q="+(p|q));
		System.out.println("~p="+(~p));
		System.out.println("p^3^3="+(p^3^3));
		System.out.println("(p&q)+(p|q)+(~p)+(p^3^3)="+resultThree);
	}
}
