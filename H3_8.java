import java.util.Scanner;
public class H3_8
{
	public static void main(String args[])
	{
		int i,a,b,max=0,min=0;
		System.out.print("����������������������");
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		if(a>b)
		{
			for(i=1;;i++)
			{
				if(a*i%b==0)
				{
					min=a*i;
					break;
				}
			}
			for(i=b;i>=1;i--)
			{
				if(a%i==0&&b%i==0)
				{
					max=i;
					break;
				}
    			}
		}
		else
		{
			for(i=2;;i++)
			{
				if(b*i%a==0)
				{
					min=b*i;
					break;
				}
			}
			for(i=a;i>=1;i--)
			{
				if(a%i==0&&b%i==0)
				{
					max=i;
					break;
				}
    			}
		}
		System.out.print("\n"+"����������С������Ϊ��"+min);
		System.out.print("\n"+"�����������Լ��Ϊ��"+max);
	}
}

		
		