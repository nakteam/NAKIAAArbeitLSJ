package de.nordakademie.evyoli.user.model;

import java.util.Date;
import java.util.List;

import de.nordakademie.evyoli.event.interfaces.IEventVisitor;
import de.nordakademie.evyoli.ride.interfaces.IRidePassenger;

public class User implements IEventVisitor, IRidePassenger {

	private Long id;
	private String eMail;
	private String password;
	private String lastName;
	private String firstName;
	private char gender;
	private Date dateOfBirth;
	private String hometown;
	private String aboutMeText;
	private List<Integer> ratings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return dateOfBirth;
	}

	public void setBirthday(Date birthday) {
		this.dateOfBirth = birthday;
	}

	public String getCity() {
		return hometown;
	}

	public void setCity(String city) {
		this.hometown = city;
	}

	public String getAboutMe() {
		return aboutMeText;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMeText = aboutMe;
	}

	public List<Integer> getRatings() {
		return ratings;
	}

	public void setRatings(List<Integer> ratings) {
		this.ratings = ratings;
	}

	public int getAverageRating() {
		return 3;
	}
}
