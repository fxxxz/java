import java.util.*;
import static java.util.Calendar.*;
public class DateExample
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		Calendar calendar=Calendar.getInstance();
		int year1,year2,month1,month2,day1,day2;
		long m1,m2,m;
		System.out.print("�����һ�����:");
		year1=reader.nextInt();
		System.out.print("���������·�:");
		month1=reader.nextInt();
		System.out.print("������µ�����:");
		day1=reader.nextInt();
		System.out.print("����ڶ������:");
		year2=reader.nextInt();
		System.out.print("���������·�:");
		month2=reader.nextInt();
		System.out.print("������µ�����:");
		day2=reader.nextInt();
		if(year1>year2)
		{
			System.out.println("������ĵڶ�������С�ڵ�һ������:");
		}
		else if(year1==year2)
		{
			if(month1>month2)
			{
				System.out.println("������ĵڶ�������С�ڵ�һ������:");
			}
			else if(month1==month2)
			{
				if(day1>day2)
				{
					System.out.println("������ĵڶ�������С�ڵ�һ������:");
				}
			}
		}
		calendar.set(year1,month1-1,day1);
		m1=calendar.getTimeInMillis();
		calendar.set(year2,month2-1,day2);
		m2=calendar.getTimeInMillis();
		m=Math.abs(m1-m2)/(1000*60*60*24);
		System.out.println(year1+"��"+month1+"��"+day1+"�պ�"+year2+"��"+month2+"��"+day2+"�����"+m+"��");
	}
}
		
				