package ba.bitcamp.klase;

public class PersonDetails {

	public String firstName;
	public String lastName;
	public Integer yearOfBirth;
	public String adress;
	public String personalID;
	public String email;
	public Integer height;
	public boolean isValid;
	public String favFood;
	public String favDrink;
	
	public PersonDetails(String firstName, String lastName,
			Integer yearOfBirth, String adress, String personalID,
			String email, Integer height, boolean isValid, String favFood,
			String favDrink) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.adress = adress;
		this.personalID = personalID;
		this.email = email;
		this.height = height;
		this.isValid = isValid;
		this.favFood = favFood;
		this.favDrink = favDrink;
	}
}
