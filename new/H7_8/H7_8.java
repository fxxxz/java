import java.util.Scanner;
public class H7_8
{
	public static void main(String args[])
	{
		int year,month;
		CalendarBean cb=new CalendarBean();
		System.out.print("请输入年份和月份:");
		Scanner reader=new Scanner(System.in);
		year=reader.nextInt();
		month=reader.nextInt();
		cb.getYear(year);
		try
		{
		    cb.getMonth(month);
		}
		catch(ExceptionC e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("      "+year+"年"+month+"月");
		System.out.println("");
		System.out.println("日 一 二 三 四 五 六");
		cb.getCalendar();
	}
}
		
		
		