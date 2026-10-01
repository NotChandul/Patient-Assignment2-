/*
 *  Class: CMSC203
 *  Instructor: Ahmed Tarek
 *  Description: Driver application that creates and tests the patient and procedure class. 
 *  Displayes information by calling methods and calculates charges for the procedures.
 *  Due: 09/30/2026
 *  Platform/Compiler: Eclipse / Java 17
 *  I pledge that I have completed the programming assignment independently. I have not
 *  copied the code from a student or any other source. I have not given my code to any student.
 *  Print your Name here: Chandul Somaweera
 *  
 */
import java.util.Scanner;

public class PatientDriverApp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Ask for patient info
		System.out.print("Enter patient first name: ");
		String fName = scan.nextLine();
		
		System.out.print("Enter patient middle name: ");
		String mName = scan.nextLine();
		
		System.out.print("Enter patient last name: ");
		String lName = scan.nextLine();
		
		System.out.print("Enter street address: ");
		String streetAddy = scan.nextLine();
		
		System.out.print("Enter city: ");
		String city = scan.nextLine();
		
		System.out.print("Enter state: ");
		String state = scan.nextLine();
		
		System.out.print("Enter zip code: ");
		String zCode = scan.nextLine();
		
		System.out.print("Enter phone number (e.g. 301-123-4567): ");
		String phone = scan.nextLine();
		
		System.out.print("Enter emergency contact name: ");
		String eName = scan.nextLine();
		
		System.out.print("Enter emergency contact phone: ");
		String ePhone = scan.nextLine();
		
		// Create patient object with all attributes
		
		Patient patient = new Patient(fName, mName, lName, streetAddy, city, state, zCode, phone, eName, ePhone);
		
		// Procedure 1 with no-arg constrctor
		Procedure procedure1 = new Procedure();
		procedure1.setProcedureName("Physical Exam");
		procedure1.setProcedureDate("7/20/2019");
		procedure1.setPractitionerName("Dr. Irvine");
		procedure1.setProcedureCharges(3250.0);
		
		// Procedure 2 with name and date constructor then the setter methods
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019");
		procedure2.setPractitionerName("Dr. Jamison");
		procedure2.setProcedureCharges(5500.43);
		
		// Procedure 3 using all all fields constructor
		Procedure procedure3 =new Procedure("Blood test", "7/20/2019", "Dr. Smith", 1400.75);
		
		//Display the object and details of the procedure
		
		
		displayPatient(patient);
		System.out.println();
		
		displayProcedure(procedure1);
		System.out.println();
		
		displayProcedure(procedure2);
		System.out.println();

		displayProcedure(procedure3);
		System.out.println();
		
		// Total charges of combined procedures
		
		double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.printf("Total Charges: $%,.2f\n\n", totalCharges);
		
		System.out.println("Student Name: Chandul Somaweera");
		System.out.println("MC#: M21228550");
		System.out.println("Due Date: 09/30/2026");
		
		scan.close();
		
	}
	/**
	 * shows the patients information
	 * @param patient object
	 */
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}
	
	/**
	 * Displays full procedure information
	 * @param procedure
	 */
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getProcedureCharges() + p2.getProcedureCharges() + p3.getProcedureCharges();
	}

}
