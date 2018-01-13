public class Rational
{
	int numerator,denominator;
	Rational()
	{
	}
	Rational(int a,int b)
	{
		setNumeratorAndDenominator(a,b);
	}
	void setNumeratorAndDenominator(int a,int b)
	{
		int c=f(Math.abs(a),Math.abs(b));
		numerator=a/c;
		denominator=b/c;
		if(numerator<0&&denominator<0)
		{
			numerator=-numerator;
			denominator=-denominator;
		}
	}
	int getNumerator()
	{
		return numerator;
	}
	int getDenominator()
	{
		return denominator;
	}
	int f(int a,int b)
	{
		if(a<b)
		{
			int c=a;
			a=b;
			b=c;
		}
		int r=a%b;
		while(r!=0)
		{
			a=b;
			b=r;
			r=a%b;
		}
		return b;
	}
    Rational add(Rational r)
	{
		int newNumerator=r.getNumerator();
		int newDenominator=r.getDenominator();
		Rational result=new Rational(numerator*newDenominator+denominator*newNumerator,denominator*newDenominator);
		return result;
	}
	Rational sub(Rational r)
	{
		int newNumerator=r.getNumerator();
		int newDenominator=r.getDenominator();
		Rational result =new Rational(Math.abs(numerator*newDenominator-denominator*newNumerator),denominator*newDenominator);
		return result;
	}
	Rational muti(Rational r)
	{
		int newNumerator=r.getNumerator();
		int newDenominator=r.getDenominator();
		Rational result =new Rational(numerator*newNumerator,denominator*newDenominator);
		return result;
	}
	Rational div(Rational r)
	{
		int newNumerator=r.getNumerator();
		int newDenominator=r.getDenominator();
		Rational result =new Rational(numerator*newDenominator,denominator*newNumerator);
		return result;
	}
}
		