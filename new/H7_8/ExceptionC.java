public class ExceptionC extends Exception
{
	String message;
	ExceptionC(int month)
	{
		message="�·�"+month+"������";
	}
	public String getMessage()
	{
		return message;
	}
}
		