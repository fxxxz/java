import java.util.Scanner;
public class ArrayAndSort
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		int count=0;
		double a[];
		System.out.println("����������ĳ��ȣ����ȱ�����������");
		count=reader.nextInt();
		a=new double[count];
		System.out.println("���������ɸ�����ÿ����һ�����س�ȷ��");
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
                    					
			