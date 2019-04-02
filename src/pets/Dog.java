package exercise_4;

class Dog
{
	private String name;
	private String breed;
	private int age;
	private double weight;

	Dog(String name, String breed, int age, double weight)
	{
		setName(name);
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}

	String getBreed()
	{
		return breed;
	}

	int getAge()
	{
		return age;
	}
	
	public String getDescription()
	{
		String description = "";
		description += "Name: " + name + "\n";
		description += "Breed: " + breed + "\n";
		description += "Age in calendar years: " + age + "\n";
		return description;
	}

	public int getAgeInHumanYears()
	{
		int humanYears = 0;
		if (age <= 2)
		{
			humanYears = age * 11;
		} else
		{
			humanYears = 22 + ((age - 2) * 5);
		}
		return humanYears;
	}

	boolean isEqualTo(Dog dog)
	{
		if (this.name.equals(dog.name) 
				&& this.breed.equals(dog.breed) 
				&& this.age == dog.age 
				&& this.weight == weight)
		{
			return true;
		} else
		{
			return false;
		}
	}
}
