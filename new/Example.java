class People
{
	static int publicNumber;
	int privateNumber;
	static void setPublicNumber(int a)
	{
		publicNumber=a;
	}
	void setPrivateNumber(int b)
	{
		privateNumber=b;
	}
	public static int getPublicNumber()
	{
		return publicNumber;
	}
	public int getPrivateNumber()
	{
		return privateNumber;
	}
}
public class Example
{
	public static void main(String args[])
	{
		People.publicNumber=8888;
		int a=People.getPublicNumber();
		System.out.println(a);
		People zhang=new People();
		People wang=new People();
		System.out.println("�������publicnumber="+People.getPublicNumber());
		System.out.println("wang��privateNumber="+wang.getPrivateNumber());
		System.out.println("zhang��privateNumber="+zhang.getPrivateNumber());
		zhang.setPublicNumber(6666);
		zhang.setPrivateNumber(123);
		wang.setPrivateNumber(789);
		System.out.println("�������publicnumber="+People.getPublicNumber());
		System.out.println("wang��privateNumber="+wang.getPrivateNumber());
		System.out.println("zhang��privateNumber="+zhang.getPrivateNumber());
		System.out.println("wang��publicNumber="+wang.getPublicNumber());
		System.out.println("zhang��publicNumber="+zhang.getPublicNumber());
	}
}
		