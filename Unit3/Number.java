import java.util.Scanner; 
public class Number{
	public static void main(String args[])
	{
		int number=0,d5,d4,d3,d2,d1;
		Scanner reader=new Scanner(System.in);
		System.out.print("����һ��1��99999֮���������");
		number=reader.nextInt();
		if(number>=1&&number<=99999)
		{
			d5=number/10000;
			d4=number%10000/1000;
			d3=number%1000/100;
			d2=number%100/10;
			d1=number%10;
			if(d5!=0)
			{
				System.out.println(number+"��5λ��");
				if(d5==d1&&d4==d2)
				{
					System.out.println(number+"�ǻ�����");
				}
				else
				{
					System.out.println(number+"���ǻ�����");
				}
			}
			else if(d4>0)
			{
				System.out.println(number+"��4λ��");
				if(d4==d1&&d3==d2)
				{
					System.out.println(number+"�ǻ�����");
				}
				else
				{
					System.out.println(number+"���ǻ�����");
				}
			}
			else if(d3>0)
			{
				System.out.println(number+"��3λ��");
				if(d3==d1)
				{
					System.out.println(number+"�ǻ�����");
				}
				else
				{
					System.out.println(number+"���ǻ�����");
				}
			}
			else if(d2>0)
			{
				System.out.println(number+"��2λ��");
				if(d2==d1)
				{
					System.out.println(number+"�ǻ�����");
				}
				else
				{
					System.out.println(number+"���ǻ�����");
				}
			}
			else if(d1!=0)
			{
				System.out.println(number+"��1λ��");
				System.out.println(number+"�ǻ�����");
			}
		}
		else
		{
			System.out.printf("%d����1��99999֮��",number);
		}
	}
}
					