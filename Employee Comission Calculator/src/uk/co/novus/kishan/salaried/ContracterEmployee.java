package uk.co.novus.kishan.salaried;

public class ContracterEmployee extends HourlyEmployee {

	private double ContracterEmployee;
	
	public ContracterEmployee(String firstName, String lastName, String nationalInsuranceNumber, double wage,
			double hours, String period) 
	{
		super(firstName, lastName, nationalInsuranceNumber, wage, hours);
		if (hours < 0.0)
			 throw new IllegalArgumentException("Hours Must be more than 0.0");
		 
		 this.setHours(hours);	 
	}

	public double getContracterEmployee() {
		return ContracterEmployee;
	}

	public void setContracterEmployee(double contracterEmployee) {
		ContracterEmployee = contracterEmployee;
	}
	
	
	
	
}
