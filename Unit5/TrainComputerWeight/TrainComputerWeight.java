import java.util.Scanner;
public class TrainComputerWeight
{
	public static void main(String args[])
	{
		int peopleNumber=0,tvNumber=0,computerNumber=0,washNumber=0,totalNumber=0;
		int i,k;
		Scanner reader=new Scanner(System.in);
		System.out.print("����˿�����:");
		peopleNumber=reader.nextInt();
		System.out.print("������ӻ�����:");
		tvNumber=reader.nextInt();
		System.out.print("������������:");
		computerNumber=reader.nextInt();
		System.out.print("����ϴ�»�����:");
		washNumber=reader.nextInt();
		totalNumber=peopleNumber+tvNumber+computerNumber+washNumber;
		SetAndGetWeight things[]=new SetAndGetWeight[totalNumber];
		Train train=new Train(things);
		System.out.println("����ÿλ�˿͵�����:");
		for(i=0,k=1;i<peopleNumber;i++,k++)
		{
			things[i]=new People();
			System.out.print("�����"+k+"λ�˿͵�����:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("����ÿ̨���ӻ�������:");
		for(k=1;i<peopleNumber+tvNumber;i++,k++)
		{
			things[i]=new Television();
			System.out.print("�����"+k+"̨���ӻ�������:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("����ÿ̨�����������:");
		for(k=1;i<(peopleNumber+tvNumber+computerNumber);i++,k++)
		{
			things[i]=new Computer();
			System.out.print("�����"+k+"̨�����������:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("����ÿ̨ϴ�»�������:");
		for(k=1;i<(peopleNumber+tvNumber+computerNumber+washNumber);i++,k++)
		{
			things[i]=new WashMachine();
			System.out.print("�����"+k+"̨ϴ�»�������:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("��װ�ص�������:"+train.getTotalWeights());
	}
}
		