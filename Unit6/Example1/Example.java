public class Example 
{
	public static void main (String args[])
	{
		ShowAlphabet show=new ShowAlphabet();
		show.inputAlphabet(new Alphabet()
		{
			public void showAlphabet()
			{
				char i=97;
				while(i<123)
				{
					System.out.print(i+" ");
					i++;
				}
			}
		}
		);
	}
}
				
			