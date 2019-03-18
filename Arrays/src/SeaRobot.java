
public class SeaRobot extends Robot {

	private boolean floats; // set variables
	private boolean submersable;
	private float depth;
	private float speed;
	private Integer gailForce;

	public SeaRobot(String manufacturer, String model, String colour, Integer cpu, Integer memory, Float cpuTemp,
			boolean floats, boolean submersable, float depth, float speed, Integer gailForce) {
		super(manufacturer, model, colour, cpu, memory, cpuTemp);
		this.floats = floats;
		this.submersable = submersable;
		this.depth = depth;
		this.speed = speed;
		this.gailForce = gailForce;
	} // this. references the current object/constructors

	public boolean isFloats() {
		return floats;
	}// returns the value

	public void setFloats(boolean floats) {
		this.floats = floats;
	}// allows for use

	public boolean isSubmersable() {
		return submersable;
	}

	public void setSubmersable(boolean submersable) {
		this.submersable = submersable;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getgailForce(Integer gailForce) {
		return gailForce;
	}

	public void setSpeed(Integer gailForce) {
		this.gailForce = gailForce;
	}

	public void gailForce() {
		if (gailForce == 0) {
			System.out.println("Keep Going");
		} else if (gailForce >= 1 && gailForce <= 5) {
			System.out.println("Change direction away from storm");
		} else if (gailForce == 10) {
			System.out.println("Seek Shelter");
		}
	}/// nested if statement

	@Override
	public String toString() {
		return "SeaRobot [floats=" + floats + ", submersable=" + submersable + ", depth=" + depth + ", speed=" + speed
				+ ", gailForce=" + gailForce + "]";
	}/// defines behaviour thats specific to the subclass/// run time poly

}
