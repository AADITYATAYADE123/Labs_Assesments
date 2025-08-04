package Pack1;

public class Lab8 {
	String fisrtName;
	String lastName;
	Gender gender;

	enum Gender { M, F };

	public Lab8() {

	}

	public Lab8(String fisrtName, String lastName, Gender gender) {
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String acceptPhoneNumber(String num) {
		return num;
	}
}



