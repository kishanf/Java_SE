import java.util.ArrayList;
import java.util.Iterator;

public class SeaRobotArray {

	public void List(SeaRobot sr1, SeaRobot sr2, SeaRobot sr3) {

		ArrayList<SeaRobot> al = new ArrayList<SeaRobot>();
		al.add(sr1);
		al.add(sr2);
		al.add(sr3);
		// al.remove(sr1);
		System.out.println();

		Iterator<SeaRobot> itr = al.iterator();
		while (itr.hasNext()) {
			SeaRobot sr = (SeaRobot) itr.next();
			System.out.println("SeaRobot" + " - " + sr.manufacturer + ", " + sr.model + ", " + sr.colour + ", " + sr.cpu
					+ ", " + sr.memory + ", " + sr.cpuTemp);
		}
		
		al.remove(sr1); ///Remove Function
		System.out.println("SEA ROBOT 1 DELETED");

		Iterator<SeaRobot> itr1 = al.iterator();
		while (itr1.hasNext()) {
			SeaRobot sr = (SeaRobot) itr1.next();
			System.out.println("SeaRobot" + " - " + sr.manufacturer + ", " + sr.model + ", " + sr.colour + ", " + sr.cpu
					+ ", " + sr.memory + ", " + sr.cpuTemp);
		}
	}
}