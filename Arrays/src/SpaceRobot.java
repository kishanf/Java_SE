
public class SpaceRobot extends Robot{

	private String fuelType;
	private float operatingTempMin;
	private float operatingTempMax;
	private float speed;
	
	public SpaceRobot(String manufacturer, String model, String colour, Integer cpu, Integer memory, Float cpuTemp, String fuelType,
			float operatingTempMin, float operatingTempMax, float speed) {
		super(manufacturer, model, colour, cpu, memory, cpuTemp);
		this.fuelType = fuelType;
		this.operatingTempMin = operatingTempMin;
		this.operatingTempMax = operatingTempMax;
		this.speed = speed;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public float getOperatingTempMin() {
		return operatingTempMin;
	}

	public void setOperatingTempMin(float operatingTempMin) {
		this.operatingTempMin = operatingTempMin;
	}

	public float getOperatingTempMax() {
		return operatingTempMax;
	}

	public void setOperatingTempMax(float operatingTempMax) {
		this.operatingTempMax = operatingTempMax;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String getRobotType() {
		return "SpaceRobot";
	}

	@Override
	public String toString() {
		return "SpaceRobot [fuelType=" + fuelType + ", operatingTempMin=" + operatingTempMin + ", operatingTempMax="
				+ operatingTempMax + ", speed=" + speed + "]";
	}
	

	
	

}
