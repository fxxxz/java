public class VerifyDate
{
	public boolean verifyDate(int year,int month,int day)
	{
		boolean boo=false;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			if(day>31||day<1)
				boo=false;
			else
				boo=true;
		}
		else if(month==4||month==6||month==9||month==11)
		{
		if(day>30||day<1)
			boo=false;
		else
			boo=true;
		}
		else if(month==2)
		{
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
			{
				if(day>29||day<1)
					boo=false;
				else
					boo=true;
			}
			else
			{
				if(day>28||day<1)
					boo=false;
			    else
					boo=true;
			}
		}
		else if(month>12||month<1)
		{
			boo=false;
		}
		return boo;
	}
}
				
			