
public class LandRobot extends Robot {

	private String terrainType;
	private float operatingTempMin;
	private float operatingTempMax;
	private float speed;
	private Integer terrainLevel;

	public LandRobot(String manufacturer, String model, String colour, Integer cpu, Integer memory, Float cpuTemp, String terrainType,
			float operatingTempMin, float operatingTempMax, float speed, Integer terrainLevel) {
		super(manufacturer, model, colour, cpu, memory, cpuTemp);
		this.terrainType = terrainType;
		this.operatingTempMin = operatingTempMin;
		this.operatingTempMax = operatingTempMax;
		this.speed = speed;
		this.terrainLevel = terrainLevel;
	}

	public String getTerrainType() {
		return terrainType;
	}

	public void setTerrainType(String terrainType) {
		this.terrainType = terrainType;
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
	
	public Integer getterrainLevel() { 
		return terrainLevel; 
	}
	
	public void setterrainLevel(Integer terrainLevel) {
		this.terrainLevel = terrainLevel;
	}
	
public void terrainLevel() {
	if (terrainLevel == 0) {
	    System.out.println("Keep Speed");  
	} else if (terrainLevel == 20) {
		System.out.println("Increase Speed");
	} else if (terrainLevel >20 && terrainLevel <= 40) {
		System.out.println("Increase Speed");
	} else if (terrainLevel >40 && terrainLevel >60) {
		System.out.println("Increase Speed");
	} else if (terrainLevel ==60) {
		System.out.println("DEPLOY STOPPER");
	} else if (terrainLevel == -20) {
		System.out.println("Decrease Speed");
	} else if (terrainLevel >-20 && terrainLevel <=-40) {
		System.out.println("Decrease Speed");
	} else if (terrainLevel >-40 && terrainLevel >60) {
		System.out.println("Decrease Speed");
	} else if (terrainLevel <= 60) {
		System.out.println("STOP & SEND RESCUE!!");
	}
	
	
	}


	@Override
	public String toString() {
		return "LandRobot [terrainType=" + terrainType + ", operatingTempMin=" + operatingTempMin
				+ ", operatingTempMax=" + operatingTempMax + ", speed=" + speed + ", terrainLevel=" + terrainLevel
				+ "]";
	}
	
		

}


