
public class AirRobot extends Robot{
	
	private boolean hover;
	private boolean strosphere;
	private float speed;
	private Integer height;
	
	public AirRobot(String manufacturer, String model, String colour, Integer cpu, Integer memory, Float cpuTemp, boolean hover,
			boolean strosphere, float speed, Integer height) {
		super(manufacturer, model, colour, cpu, memory, cpuTemp);
		this.hover = hover;
		this.strosphere = strosphere;
		this.speed = speed;
		this.height = height;
	}
	
	public boolean isHover() {
		return hover;
	}
	public void setHover(boolean hover) {
		this.hover = hover;
	}
	public boolean isStrosphere() {
		return strosphere;
	}
	public void setStrosphere(boolean strosphere) {
		this.strosphere = strosphere;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
public void height() {
		if (strosphere == false  && height == 1) {
		    System.out.println("Stop climbing");  
		} else if(strosphere == false && height <1){
			System.out.println("Keep Climbing");
		} else if(strosphere == true) {
			System.out.println("Glide");
		}
}

@Override
public String toString() {
	return "AirRobot [hover=" + hover + ", strosphere=" + strosphere + ", speed=" + speed + ", height=" + height + "]";
}
	
	

}