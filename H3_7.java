public class H3_7
{
	public static void main(String args[])
	{
		int i,j,sum;
		System.out.println("1000���ڵ���������Ϊ��");
		for(i=1;i<=1000;i++)
		{
			sum=1;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					sum+=j;
			}
			if(i==1)
			continue;
			if(i==sum)
				System.out.println(i);
		}
	}
}

				