public class Example
{
	public static void main(String args[])
	{
		TestCry test=new TestCry();
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("è"+"�Ľ���:"+"��...��...");
		    }
	    }
		);
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("��"+"�Ľ���:"+"��...��...");
		    }
	    }
		);
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("ʨ��"+"�Ľ���:"+"��...��...");
		    }
	    }
		);
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("��"+"�Ľ���:"+"��...��...");
		    }
	    }
		);
    }
}
			
	