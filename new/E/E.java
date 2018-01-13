public class E
{
	public static void main(String args[])
	{
		ChinaPeople chinaPeople=new ChinaPeople();
		chinaPeople.height=168.168;
		BeijingPeople beijingPeople=new BeijingPeople();
		beijingPeople.height=172.16;
		chinaPeople.speakHello();
		beijingPeople.speakHello();
		chinaPeople.averageHeight();
		beijingPeople.averageHeight();
		chinaPeople.chinaGongfu();
		beijingPeople.beijingOpera();
		beijingPeople.chinaGongfu();
	}
}