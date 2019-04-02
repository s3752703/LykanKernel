package exercise_4;

public class Vet
{
	public void run()
	{
		Dog cain = new Dog("Cain", "German Sheppherd", 8, 7.5);
		Dog thai = new Dog("Thai", "German Sheppherd", 8, 6.0);
		Dog fido = new Dog("Fido", "Labrador", 6, 5.0);
		
		System.out.println(cain.getName());
		System.out.println(thai.getName());
		System.out.println(fido.getName());

		// Points to the data not the variable
		int number1 = 5;
		int number2 = 10;
		int number3 = number1;
		number3 = 20;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);

		// System.out.println("Number 1 is: " + number1 + " and number 2 is: " +
		// number2);
		// System.out.println("The numbers are equal: " + (number1 == number2));
		// System.out.println("Number 3 is: " + number3);
		swap(fido, thai);

		System.out.println(cain.getName());
		System.out.println(thai.getName());
		System.out.println(fido.getName());
		
		Dog cain_2 = new Dog("Cain", "German Sheppherd", 8, 7.5);
		
		System.out.println(cain_2.getDescription());
		System.out.println("Age in human years: " + cain_2.getAgeInHumanYears());
		System.out.println("Are Cain 1 & 2 the same: " + cain.isEqualTo(cain_2));
	}

	public void swap(int var1, int var2)
	{
		int temp = var1;
		var1 = var2;
		var2 = temp;
	}

	// Java always 'passes by value' i.e. the value of the reference
	public void swap(Dog dog1, Dog dog2)
	{
		// These are all local variables, so they are swapped locally.
		// But they still point to an object in memory so the original
		// values will be changed and reflected outside of the method call.
		dog1.setName("Rex");
		Dog temp = dog1;
		dog1 = dog2;
		dog2 = temp;
	}
}
