public class H3_9
{
	public static void main(String args[])
	{
		int i,sum=0,p=1;
		for(i=1;;i++)
		{
			p*=i;
			sum+=p;
			if(sum>9999)
				break;
		}
		System.out.println("满足条件的最大整数n为："+(i-1));
	}
}
		