public class H3_6_w
{
	public static void main(String args[])
	{
		int i=1;
                double sum=0,p=1;
                while(i<=20)
          	{
			p*=i;
			sum+=1/p;
			i++;
		}
		System.out.println(sum);
	}
}
