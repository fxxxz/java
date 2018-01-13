public class Computer
{
	public int f(int m,int n) throws NumberException
	{
		if(m<=0||n<0)
		{
			NumberException question=new NumberException();
			question.setMessage("本方法不允许计算负数的最大公约数");
			throw question;
		}
		if(n>m)
		{
			int temp=m;
			m=n;
			n=temp;
		}
		int r=m%n;
		while(r!=0)
		{
			m=n;
			n=r;
			r=m%n;
		}
		return n;
	}
	public int g(int m,int n) throws NumberException
	{
		if(m<=0||n<=0)
		{
			NumberException question=new NumberException();
			question.setMessage("本方法不允许计算负数的最小公倍数");
			throw question;
		}
		int result=(m*n)/f(m,n);
		return result;
	}
}
			