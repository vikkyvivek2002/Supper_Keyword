class m1
{
	int x =11; 
	int y = 99;
	void add()
	{
		System.out.println("Adiition is "+ (x+y));
	}
}

class m2 extends m1
{
	void sub()
	{
		super.add();
		System.out.println("Sub is "+ (super.x - super.y));
	}
}

public class Supper_Keyword 
{
	public static void main(String[] args) {
	
		m2 obj = new m2();
		obj.sub();

	}

}