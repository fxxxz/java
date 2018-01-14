enum Season
{
	Spring,Summer,Autumn,Winter
}
enum Number
{
	first,second,third,fourth
}
public class GuessNumber
{
	public static void main(String args[])
	{
		Season season=Season.Spring;
		Number number=Number.first;
		System.out.println(season+" is the "+number);
		season=Season.Winter;
		number=Number.fourth;
		System.out.println(season+" is the "+number);
	}
}