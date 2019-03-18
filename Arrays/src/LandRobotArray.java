import java.util.ArrayList;
import java.util.Iterator;

public class LandRobotArray {

	public void List(LandRobot lr1, LandRobot lr2, LandRobot lr3) {

		ArrayList<LandRobot> al = new ArrayList<LandRobot>();
		al.add(lr1);
		al.add(lr2);
		al.add(lr3);
		System.out.println(); 

		Iterator<LandRobot> itr = al.iterator();
		while (itr.hasNext()) {
			LandRobot lr = (LandRobot) itr.next();
			System.out.println("LandRobot"+ " - "+lr.manufacturer + ", " + lr.model + ", " + lr.colour + ", " + lr.cpu + ", " + lr.memory + ", "
					+ lr.cpuTemp);

		}
	}
}