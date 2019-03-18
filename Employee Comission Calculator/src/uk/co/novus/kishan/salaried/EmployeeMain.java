package uk.co.novus.kishan.salaried;

public class EmployeeMain {

	public static void main(String[] args) {
		BasePlusCommissonEmployee BPCE = new BasePlusCommissonEmployee("Kishan" , "Fokeer", "PB39572537", 20000 , 0.5, 10000);
		
		System.out.println(BPCE.toString());
	}

}
