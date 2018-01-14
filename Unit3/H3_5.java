public class H3_5
{
	public static void main(String args[])
	{
		int i,j;
		System.out.println("100以内的全部素数为：");
		for(i=2;i<=100;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(j==i)
				System.out.println(i);
		}
	}
}
			