public class E1
{
	public static void main(String args[])
	{
		Rational r1=new Rational(1,5);
		Rational r2=new Rational(3,2);
		Rational result=new Rational();
		result=r1.add(r2);
		double p=(double)result.getNumerator()/(double)result.getDenominator();
		System.out.println("����"+r1.getNumerator()+"/"+r1.getDenominator()+"�����"+r2.getNumerator()+"/"+r2.getDenominator()+"�ĺ͵���"+result.getNumerator()+"/"+result.getDenominator()+"="+p);
		r1.setNumeratorAndDenominator(4,7);
		r2.setNumeratorAndDenominator(-5,20);
		result=r1.muti(r2);
		p=(double)result.getNumerator()/(double)result.getDenominator();
		System.out.println("����"+r1.getNumerator()+"/"+r1.getDenominator()+"�����"+r2.getNumerator()+"/"+r2.getDenominator()+"�Ļ�����"+result.getNumerator()+"/"+result.getDenominator()+"="+p);
		System.out.println("����2/1+3/2+5/3+8/5+13/8...��ǰ8��ͣ��÷�����ʾ���:");
		int k=1;
		Rational sum=new Rational(2,1);
		Rational item=new Rational(3,2);
		while(k<=7)
		{
			sum=sum.add(item);
			k++;
			int m=item.getNumerator();
			int n=item.getDenominator();
			item.setNumeratorAndDenominator(m+n,m);
		}
		System.out.println(sum.getNumerator()+"/"+sum.getDenominator());
	}
}

		