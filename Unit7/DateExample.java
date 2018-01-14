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
		System.out.print("输入第一个年份:");
		year1=reader.nextInt();
		System.out.print("输入该年的月份:");
		month1=reader.nextInt();
		System.out.print("输入该月的日期:");
		day1=reader.nextInt();
		System.out.print("输入第二个年份:");
		year2=reader.nextInt();
		System.out.print("输入该年的月份:");
		month2=reader.nextInt();
		System.out.print("输入该月的日期:");
		day2=reader.nextInt();
		if(year1>year2)
		{
			System.out.println("您输入的第二个日期小于第一个日期:");
		}
		else if(year1==year2)
		{
			if(month1>month2)
			{
				System.out.println("您输入的第二个日期小于第一个日期:");
			}
			else if(month1==month2)
			{
				if(day1>day2)
				{
					System.out.println("您输入的第二个日期小于第一个日期:");
				}
			}
		}
		calendar.set(year1,month1-1,day1);
		m1=calendar.getTimeInMillis();
		calendar.set(year2,month2-1,day2);
		m2=calendar.getTimeInMillis();
		m=Math.abs(m1-m2)/(1000*60*60*24);
		System.out.println(year1+"年"+month1+"月"+day1+"日和"+year2+"年"+month2+"月"+day2+"日相隔"+m+"天");
	}
}
		
				