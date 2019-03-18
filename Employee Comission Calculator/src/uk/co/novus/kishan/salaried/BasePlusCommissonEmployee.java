package uk.co.novus.kishan.salaried;

public class BasePlusCommissonEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BasePlusCommissonEmployee(String firstName, String lastName, String nationalInsuranceNumber,
			double grossSales, double commissionRate, double baseSalary)
	{
		super(firstName, lastName, nationalInsuranceNumber, grossSales, commissionRate);	 
		 if (baseSalary < 0.0)
			 throw new IllegalArgumentException("Base Salary Must be more than 0.0");
		 
		 this.setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override                                                           
	   public double earnings()                                            
	   {                                                                   
	      return getBaseSalary() * (1 + getCommissionRate());                    
	   } 

	@Override                                                   
	   public String toString()                                    
	   {                                                           
	      return String.format("%s: %s%n%s: £%,.2f \n%s: %.2f",    
	         "base plus commission employee", super.toString(),              
	         "base salary", getBaseSalary(),                       
	         "commission rate", getCommissionRate());             
	  }
	
}


