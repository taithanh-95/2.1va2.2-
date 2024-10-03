package test;

public class Author {
	String name;
	String email;
	char gender;
	public Author( String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return "Author[name= " + " email= " + "gender= " + "]";
	}
}
