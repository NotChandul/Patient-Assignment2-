/*
 *  Class: CMSC203
 *  Instructor: Ahmed Tarek
 *  Description: Procedure class allows the creatuion of procedure objects with their name, date, practitioner, and charge. You can 
 *  also get and set each field of the object along with call the toString method to print all fields.
 *  Due: 09/30/2026
 *  Platform/Compiler: Eclipse / Java 17
 *  I pledge that I have completed the programming assignment independently. I have not
 *  copied the code from a student or any other source. I have not given my code to any student.
 *  Print your Name here: Chandul Somaweera
 *  
 */


public class Procedure {

	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharges;
	
	/**
	 * Creates a procedure object with empty fields
	 */
	public Procedure() {
		
		this.procedureName = "";
		this.procedureDate = "";
		this.practitionerName = "";
		this.procedureCharges = 0;
		
	}

	/**
	 * create an object with the procedure name and date
	 * @param pN
	 * @param pD
	 */
	public Procedure(String pN, String pD) {
		
		this.procedureName = pN;
		this.procedureDate = pD;
		
	}
	
	/**
	 * Creates a procedure object with all fields filled in.
	 * @param pN
	 * @param pD
	 * @param pracName
	 * @param pC
	 */
	public Procedure(String pN, String pD, String pracName, double pC) {
		
		this.procedureName = pN;
		this.procedureDate = pD;
		this.practitionerName = pracName;
		this.procedureCharges = pC;
		
	}
	
	//Getter Methods
	
	/**
	 * 
	 * @return patient procedure name
	 */
	public String getProcedureName() {
		return procedureName;
	
	}
	
	/**
	 * 
	 * @return patient procedure date
	 */
	public String getProcedureDate() {
		return procedureDate;
	}
	
	/**
	 * 
	 * @return patient practitioner name
	 */
	public String getPractitionerName() {
		return practitionerName;
	}
	
	/**
	 * 
	 * @return patient procedure charges
	 */
	public double getProcedureCharges() {
		return procedureCharges;
	}
	
	// Setter methods
	
	/**
	 * 
	 * @param pD, enters the procedure name
	 */
	public void setProcedureName(String pN) {
		this.procedureName = pN;
	}
	
	/**
	 * 
	 * @param pD, enters the procedure date
	 */
	public void setProcedureDate(String pD) {
		this.procedureDate = pD;
	}
	
	/**
	 * 
	 * @param pracName, enters the practitioners name
	 */
	public void setPractitionerName(String pracName) {
		this.practitionerName = pracName;
	}
	
	/**
	 * 
	 * @param pC, enters a charge for the procedure
	 */
	public void setProcedureCharges(double pC) {
		this.procedureCharges = pC;
	}
	
	/**
	 * @return procedure information
	 */
	public String toString() {
		return "\tProcedure: " + procedureName + "\n" + 
			   "\tProcedureDate=" + procedureDate + "\n" +
			   "\tPractitioner=" + practitionerName + "\n" +
			   "\tCharge=" + procedureCharges;
	}
	
	
}
