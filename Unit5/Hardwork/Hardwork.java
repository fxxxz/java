import java.util.Scanner;
public class Hardwork
{
	public static void main(String args[])
	{
		int a=0,b=0,c=0,totalNumber=0;
		Scanner reader=new Scanner(System.in);
		System.out.print("���빫˾A����Ա��:");
		a=reader.nextInt();
		System.out.print("���빫˾B����Ա��:");
		b=reader.nextInt();
		System.out.print("���빫˾c����Ա��:");
		c=reader.nextInt();
		totalNumber=a+b+c;
		System.out.println("��˾�ܹ�Ա��:"+totalNumber);
		Employee[] employee=new Employee[totalNumber];
		Company company=new Company(employee);
		for(int i=0;i<b;i++)
		{
			employee[i]=new AgradeEmployee();
		}
		for(int i=a;i<a+b;i++)
		{
			employee[i]=new BgradeEmployee();
		}
		for(int i=a+b;i<a+b+c;i++)
		{
			employee[i]=new CgradeEmployee();
		}
		System.out.println("��˾��нˮ�ܶ�:"+company.salariesPay());
	}
}
			
		
		