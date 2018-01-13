public class ExceptionC extends Exception
{
	String message;
	ExceptionC(int month)
	{
		message="月份"+month+"不合理";
	}
	public String getMessage()
	{
		return message;
	}
}
		