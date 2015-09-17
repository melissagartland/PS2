package MainPackage;

public class MyInteger 
{

	private int value; // method to get value, not visible

	public MyInteger(int i) {  //constructor

	}

	public int getValue() { //getter
		return value;
	}

	public void setValue(int value) { //setter
		this.value = value;
	}

	public boolean IsEven() // method to test even
	{
		if ((this.getValue() % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean IsOdd() // method to test odd
	{
		if ((this.getValue() % 2) != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean IsPrime(int value) // method to test prime
	{
		if (Math.abs(value) == 2) {
			return true;
		}
		if (value % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= value; i += 2) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
		
		

	public void Display(int value) {
		if (this.IsEven() == true) {
			System.out.println(value + " is even.");
		} else if (this.IsOdd() == true) {
			System.out.println(value + " is odd.");
		} else if (IsPrime(value) == true) {
			System.out.println(value + " is prime. ");
		}
	}
}
