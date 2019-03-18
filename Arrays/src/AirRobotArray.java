import java.util.ArrayList;

public class AirRobotArray {

	public void List(AirRobot ar1, AirRobot ar2, AirRobot ar3) {

		ArrayList<AirRobot> al = new ArrayList<AirRobot>();
		al.add(ar1);
		al.add(ar2);
		al.add(ar3);
		System.out.println(); 

	for(AirRobot robot:al) {
			System.out.println("AirRobot"+ " - "+ robot.manufacturer + ", " + robot.model + ", " + robot.colour + ", " + robot.cpu + ", " + robot.memory + ", "
					+ robot.cpuTemp);

		}
	}
}
 
///Iterator<AirRobot> itr = al.iterator();
///while (itr.hasNext()) {
	//AirRobot ar = (AirRobot) itr.next();
	//System.out.println("AirRobot"+ " - "+ ar.manufacturer + ", " + ar.model + ", " + ar.colour + ", " + ar.cpu + ", " + ar.memory + ", "
			//+ ar.cpuTemp);
