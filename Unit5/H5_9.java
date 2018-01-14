class A
{
	void f()
	{
		char i;
		for(i='a';i<='z';i++)
		{
			System.out.print(" "+i);
		}
	}
}
class B extends A
{
	void g()
	{
		int i;
		for(i=1;i<=50;i++)
		{
			System.out.print(" "+i);
		}
	}
}
public class H5_9
{
	public static void main(String args[])
	{
		B b=new B();
		b.f();
		System.out.print("\n");
		b.g();
	}
}