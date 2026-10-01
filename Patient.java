/*
 *  Class: CMSC203
 *  Instructor: Ahmed Tarek
 *  Description: Patient class are patients with their contact information and other personal information.
 *  Due: 09/30/2026
 *  Platform/Compiler: Eclipse / Java 17
 *  I pledge that I have completed the programming addignment independently. I have not
 *  copied the code from a student or any other source. I have not given my code to any student.
 *  Print your Name here: Chandul Somaweera
 *  
 */
public class Patient {

	// Variables
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	
	private String phoneNumber;
	private String emergencyContactPhone;
	private String emergencyContactName;
	
	// constructors no args
	public Patient() {
		
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";

		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zipCode = "";
		
		this.phoneNumber = "";
		this.emergencyContactPhone = "";
		this.emergencyContactName = "";
	}
	
	/**
	 *  Full name parameter patient constructor
	 * @param fN, first name 
	 * @param mN, middle name
	 * @param lN, last name
	 */
	public Patient(String fN, String mN, String lN) {
		this();
		this.firstName = fN;
		this.middleName = mN;
		this.lastName = lN;
	}
	
	/**
	 * All information parameter patient constructior
	 * @param fN, first name
	 * @param mN, middle name
	 * @param lN, last name
	 * @param streetAddy, street address
	 * @param city, city of patient
	 * @param state, state of patient
	 * @param zCode, zip code of patient
	 * @param pN, phone number
	 * @param eCN, emergency contact name
	 * @param eCP, emergency contact phone
	 */
	public Patient(String fN, String mN, String lN, String streetAddy, String city, String state, String zCode, String pN,
			String eCN, String eCP) {
		this.firstName = fN;
		this.middleName = mN;
		this.lastName = lN;
		
		this.streetAddress = streetAddy;
		this.city = city;
		this.state = state;
		this.zipCode = zCode;
		
		this.phoneNumber = pN;
		this.emergencyContactPhone = eCP;
		this.emergencyContactName = eCN;
		
		
	}
	/**
	 * 
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @return middle name
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	/**
	 * 
	 * @return last Name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * 
	 * @return street address
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	
	/**
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * 
	 * @return state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * 
	 * @return zip code
	 */
	public String getZipCode() {
		return zipCode;
	}
	
	/**
	 * 
	 * @return phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * 
	 * @return emergency contact name
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	
	/**
	 * 
	 * @return emergency contact phone
	 */
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}
	
	// Setter methods
	
	
	/**
	 * 
	 * @param fN, first name
	 */
	public void setFirstName(String fN) {
		this.firstName = fN;
	}
	/**
	 * 
	 * @param mN, middle name
	 */
	public void setMiddleName(String mN) {
		this.middleName = mN;

	}
	
	/**
	 * 
	 * @param lN, last name
	 */
	public void setLastName(String lN) {
		this.lastName = lN;
	}
	
	/**
	 * 
	 * @param sA, street address
	 */
	public void setStreetAddress(String sA) {
		this.streetAddress = sA; 
	}
	
	/**
	 * 
	 * @param city, patient city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
	/**
	 * 
	 * @param state, patient state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * 
	 * @param zC, zip code
	 */
	public void setZipCode(String zC) {
		this.zipCode = zC;
	}
	
	/**
	 * 
	 * @param pN, phone Number
	 */
	public void setPhoneNumber(String pN) {
		this.phoneNumber = pN;
	}
	
	/**
	 * 
	 * @param eCN, emergency contact name
	 */
	public void setEmergencyContactName(String eCN) {
		this.emergencyContactName = eCN;
	}
	
	/**
	 * 
	 * @param eCP, emergency contact phone
	 */
	public void setEmergencyContactPhone(String eCP) {
		this.emergencyContactPhone = eCP;
	}
	
	/*
	 *  Build methods
	 *  
	 */
	
	/**
	 * 
	 * @return the patients full name
	 */
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	/**
	 * 
	 * @return the patients full address
	 */
	public String buildAddress() {
		return streetAddress + ", " + city + ", " + state + ", " + zipCode; 
	}
	
	/**
	 * 
	 * @return The patients emergency contact information
	 */
	public String buildEmergencyContact() {
		return emergencyContactName + ", " + emergencyContactPhone;
	}
	
	/**
	 * @return String of patients full info
	 */
	public String toString() {
		return "Patient full Info:\n" + "Name: " + buildFullName() + "\n" + "Address: " + buildAddress() + "\n" + "Emergency Contact: " + buildEmergencyContact(); 
	}
	
}
