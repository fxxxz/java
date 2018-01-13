public class Example
{
	public static void main(String args[])
	{
		TestCry test=new TestCry();
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("Ã¨"+"µÄ½ÐÉù:"+"ß÷...ß÷...");
		    }
	    }
		);
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("¹·"+"µÄ½ÐÉù:"+"Íô...Íô...");
		    }
	    }
		);
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("Ê¨×Ó"+"µÄ½ÐÉù:"+"ºð...ºð...");
		    }
	    }
		);
		test.testCry(new Animal()
		{
			public void cry()
			{
				System.out.println("ÀÇ"+"µÄ½ÐÉù:"+"º¿...º¿...");
		    }
	    }
		);
    }
}
			
	