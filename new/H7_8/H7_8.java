import java.util.Scanner;
public class H7_8
{
	public static void main(String args[])
	{
		int year,month;
		CalendarBean cb=new CalendarBean();
		System.out.print("��������ݺ��·�:");
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
		System.out.println("      "+year+"��"+month+"��");
		System.out.println("");
		System.out.println("�� һ �� �� �� �� ��");
		cb.getCalendar();
	}
}
		
		
		