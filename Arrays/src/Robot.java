public abstract class Robot {
	
	protected String manufacturer;
	protected String model;
	protected String colour;
	protected Integer cpu;
	protected Integer memory;
	protected float cpuTemp;
	
	public Robot(String manufacturer, String model, String colour, Integer cpu, Integer memory, float cpuTemp) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.colour = colour;
		this.cpu = cpu;
		this.memory = memory;
		this.cpuTemp = cpuTemp; 
	}
		
public void tempCheck () {
	if (cpuTemp > 80.5) {
		System.out.println("Airflow to increase");
	} else if (cpuTemp > 160.5) {
		System.out.println("Shutdown");
	} else {
		System.out.println("Keep Going");
	}
				
}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}	
	
	public String getRobotType(){
		return "robottype";
	}

	public float getCpuTemp() {
		return cpuTemp;
	}

	public void setCpuTemp(float cpuTemp) {
		this.cpuTemp = cpuTemp;
	}

}
