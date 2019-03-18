package uk.co.novus.kishan.salaried;

public abstract class Employee {
	
	   private final String firstName;
	   private final String lastName;
	   private final String nationalInsuranceNumber;

	   // constructor
	   public Employee(String firstName, String lastName, 
	      String nationalInsuranceNumber)
	   {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.nationalInsuranceNumber = nationalInsuranceNumber;
	   } 

	   // return first name
	   public String getFirstName()
	   {
	      return firstName;
	   } 

	   // return last name
	   public String getLastName()
	   {
	      return lastName;
	   } 

	   // return social security number
	   public String getNationalInsuranceNumber()
	   {
	      return nationalInsuranceNumber;
	   } 

	   // return String representation of Employee object
	   @Override
	   public String toString()
	   {
	      return String.format("%s %s%nnational insurance number: %s", 
	         getFirstName(), getLastName(), getNationalInsuranceNumber());
	   }

	   public abstract double earnings(); 

	}
