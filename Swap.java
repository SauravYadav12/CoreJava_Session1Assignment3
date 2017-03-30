class Swap{

	public static void main(String[] args)
	{

		int a = 55 , b = 75 ;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("The new values are " + "\n" + "a :" + a + "\n" + "B :" + b);
	}
}