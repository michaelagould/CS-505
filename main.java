
public class Main {

    public static void main(String[] args) {

        Rational a = new Rational(2, 4);
        Rational b = new Rational(2, 6);

        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " - " + b + " = " + a.sub(b));
        System.out.println(a + " * " + b + " = " + a.mul(b));
        System.out.println(a + " / " + b + " = " + a.div(b));

        //System.out.println(a + " = " + a + " is " + a.equals(new Rational(1, 2)));
        //System.out.println(a + " = " + b + " is " + a.equals(new Rational(1, 3)));

        Rational[] arr = {new Rational(7, 1), new Rational(6, 1),
                          new Rational(5, 1), new Rational(4, 1),
                          new Rational(3, 1), new Rational(2, 1),
                          new Rational(1, 1), new Rational(1, 2),
                          new Rational(1, 3), new Rational(1, 4),
                          new Rational(1, 5), new Rational(1, 6),
                          new Rational(1, 7), new Rational(1, 8),
                          new Rational(1, 9), new Rational(0, 1)};

        selectSort(arr);

        for (Rational r : arr) {
            System.out.println(r);
        }

        Number n = new Rational(3, 2);

        System.out.println(n.doubleValue());
        System.out.println(n.floatValue());
        System.out.println(n.intValue());
        System.out.println(n.longValue());
    }

    public static <T extends Comparable<? super T>> void selectSort(T[] array) {

        T temp;
        int mini;

        for (int i = 0; i < array.length - 1; ++i) {

            mini = i;

            for (int j = i + 1; j < array.length; ++j) {
	            if (array[j].compareTo(array[mini]) < 0) {
	                mini = j;
	            }
            }

            if (i != mini) {
	            temp = array[i];
	            array[i] = array[mini];
	            array[mini] = temp;
            }
        }
    }
}


public class Rational extends Number implements Comparable<Rational>{
	
	private int numerator;
	private int denominator;
	private int gcd;
	
	public double doubleValue(){return numerator/denominator;}
	public float floatValue(){return numerator/denominator;}
	public int intValue(){return numerator/denominator;}
	public long longValue(){return numerator/denominator;}
	
	public Rational(int numerator, int denominator){

		int gcd = gcd(numerator,denominator);
		this.numerator = numerator/gcd;
		this.denominator = denominator/gcd;
	}

	private int gcd(int first, int second){
		if (second == 0)
			return first;
		return gcd(second, first%second);
	}
		
	private Rational makeDenominatorSame(Rational o){
		
		if(this.denominator == o.denominator)
			return this;
		return new Rational(o.denominator * numerator, o.denominator * denominator);
	}
		
	public Rational add(Rational o){
		
		Rational tempA = this.makeDenominatorSame(o);
		Rational tempB = o.makeDenominatorSame(this);
		return new Rational(tempA.numerator + tempB.numerator, tempA.denominator);
	}
	

	public Rational sub(Rational o){

		Rational tempA = this.makeDenominatorSame(o);
		Rational tempB = o.makeDenominatorSame(this);
		return new Rational(tempA.numerator - tempB.numerator, tempA.denominator);
	}

	public Rational mul(Rational o){

		return new Rational(numerator * o.numerator, denominator * o.denominator);
	}
}