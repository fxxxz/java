public class H3_6_f
{
	public static void main(String args[])
	{
		int i;
		double sum=0,p=1;
		for(i=1;i<=20;i++)
		{
			p*=i;
			sum+=1/p;
		}
		System.out.println(sum);
	}
}	
