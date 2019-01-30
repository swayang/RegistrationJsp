package org.oecm19.Model;


public class Student {
	private String userName;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phNo;
	private String zipCode;
	private String pasWord;
	private String cpasWord;

	public Student(String userName1, String firstName2, String lastName2, String emailId2, String phNo2,
			String zipCode2, String pasWord2, String cpasWord2) {
		this.userName = userName1;
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.emailId = emailId2;
		this.phNo = phNo2;
		this.zipCode = zipCode2;
		this.pasWord = pasWord2;
		this.cpasWord = cpasWord2;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPasWord() {
		return pasWord;
	}

	public void setPasWord(String pasWord) {
		this.pasWord = pasWord;
	}

	public String getCpasWord() {
		return cpasWord;
	}

	public void setCpasWord(String cpasWord) {
		this.cpasWord = cpasWord;
	}

}


