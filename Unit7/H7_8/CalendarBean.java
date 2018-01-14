import java.util.Calendar;
public class CalendarBean
{
	int year,month,week,day,i,k;
	Calendar calendar=Calendar.getInstance();
	public void getYear(int year)
	{
		this.year=year;
	}
	public void getMonth(int month) throws ExceptionC
	{
		if(month<1||month>12)
		{
			throw new ExceptionC(month);
		}
		else
		{
			this.month=month;
		}
	}
	public void getCalendar()
	{
	calendar.set(year,month-1,1);
	week=calendar.get(Calendar.DAY_OF_WEEK)-1;
	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
	{
		day=31;
	}
	if(month==4||month==6||month==9||month==11)
	{
		day=30;
	}
	if(month==2)
	{
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			day=29;
		}
		else
		{
			day=28;
		}
	}
	
	for(i=0;i<week;i++)
	{
		System.out.print("   ");
	}
	for(k=1;k<=day;k++)
	{
		if(k<10)
		{
			System.out.print(" "+k+" ");
		}
	    else
		{
			System.out.print(k+" ");
		}
		i++;
		if(i%7==0)
		{
			System.out.println("");
		}
	}
	}
}

		
		