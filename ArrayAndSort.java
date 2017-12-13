import java.util.Scanner;
public class ArrayAndSort
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		int count=0;
		double a[];
		System.out.println("请输入数组的长度，长度必须是正整数");
		count=reader.nextInt();
		a=new double[count];
		System.out.println("请输入若干个数，每输入一个数回车确认");
		int k=0;
		while(k<a.length)
		{
			double x=reader.nextDouble();
			a[k]=x;
			k++;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					double temp=0;
                    temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %9.3f ",a[i]);
		}
	}
}
                    					
			