import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class RobotMain {

	public static void main(String[] args) {

		LandRobot clive = new LandRobot("IBM", "XR-1", "Red", 7, 1000000, 80.5f, " all", -20.275f, 270.9870f, 35.275f,
				60);
		SeaRobot pablo = new SeaRobot("Dyson", "TB4", "Yellow", 3250, 1000000, 160.5f, true, false, 0.000f, 40.45f, 10);
		AirRobot blade = new AirRobot("Airbus", "A790", "Silver", 4570, 10000000, 80.5f, false, true, 1600.345f, 1);
		SpaceRobot brian = new SpaceRobot("Tesla", "X6", "Pink", 500, 1000000, 160.5f, " Cheese", -200.50f, 99999.99f,
				25000.50f);
		///////////////////////////////////

		AirRobot ar1 = new AirRobot("Airbus", "A790", "Silver", 4570, 10000000, 80.5f, false, true, 1600.345f, 1);
		AirRobot ar2 = new AirRobot("Jet", "A90", "Red", 470, 10302000, 88.5f, false, true, 1800.345f, 1);
		AirRobot ar3 = new AirRobot("F80", "A720", "Grey", 4670, 10200400, 84.5f, false, true, 1500.345f, 1);

		LandRobot lr1 = new LandRobot("IBM", "XR-1", "Red", 7, 1000000, 80.5f, "all", -20.275f, 270.9870f, 35.275f, 60);
		LandRobot lr2 = new LandRobot("LandRover", "XR-2", "Green", 7, 1000000, 80.5f, "all", -20.275f, 270.9870f,
				35.275f, 60);
		LandRobot lr3 = new LandRobot("All Terrain", "XR-1", "Black", 7, 1000000, 80.5f, "all", -20.275f, 270.9870f,
				35.275f, 60);

		SeaRobot sr1 = new SeaRobot("Titanic", "TB4", "Black and White", 3250, 1000000, 160.5f, true, false, 0.000f,
				40.45f, 10);
		SeaRobot sr2 = new SeaRobot("Boat", "TB3", "Blue", 3250, 1000000, 160.5f, true, false, 0.000f, 40.45f, 10);
		SeaRobot sr3 = new SeaRobot("Deep Blue", "TB8", "Silver", 3250, 1000000, 160.5f, true, false, 0.000f, 40.45f,
				10);

		AirRobotArray array = new AirRobotArray();
		array.List(ar1, ar2, ar3);
		LandRobotArray array1 = new LandRobotArray();
		array1.List(lr1, lr2, lr3);
		SeaRobotArray array3 = new SeaRobotArray();
		array3.List(sr1, sr2, sr3);

		System.out.println();

		System.out.println("Parent method make " + clive.getModel());
		System.out.println("Parent method make " + clive.getTerrainType());
		System.out.println("Land Robot Specs " + clive.getColour());
		System.out.println("Space Robot Specs" + brian.getFuelType());

		System.out.println();

		System.out.println(brian.toString());
		System.out.println(clive.toString());
		System.out.println(pablo.toString());
		System.out.println(blade.toString());

		System.out.println();

		///////////////////////////////////////

		AirRobotHash aar1 = new AirRobotHash("Landingpad", true, false);
		AirRobotHash aar2 = new AirRobotHash("Helipad", false, false);
		AirRobotHash aar3 = new AirRobotHash("Highrise", false, true);

		Map<Integer, AirRobotHash> map = new Hashtable<Integer, AirRobotHash>();
		//
		map.put(1, aar1);
		map.put(2, aar2);
		map.put(3, aar3);

		// Traversing Map
		for (Entry<Integer, AirRobotHash> entry : map.entrySet()) {
			Integer key = entry.getKey();
			AirRobotHash r = entry.getValue();
			System.out.println(key + " Air Robot Details: ");
			System.out.println(r.getParkingLocation() + ", " + r.getDeleted() + ", " + r.getUpgrade());
		}
		System.out.println(" ");

		LandRobotHash llr1 = new LandRobotHash("Garage", false, false);
		LandRobotHash llr2 = new LandRobotHash("Garage", false, true);
		LandRobotHash llr3 = new LandRobotHash("Garage", true, false);

		Map<Integer, LandRobotHash> map2 = new Hashtable<Integer, LandRobotHash>();
		//
		map2.put(1, llr1);
		map2.put(2, llr2);
		map2.put(3, llr3);

		// Traversing Map
		for (Entry<Integer, LandRobotHash> entry : map2.entrySet()) {
			Integer key = entry.getKey();
			LandRobotHash r = entry.getValue();
			System.out.println(key + " Land Robot Details: ");
			System.out.println(r.getParkingLocation() + ", " + r.getDeleted() + ", " + r.getUpgrade());
		}
		System.out.println(" ");

		SeaRobotHash ssr1 = new SeaRobotHash("Dock", true, false);
		SeaRobotHash ssr2 = new SeaRobotHash("Sea Dock", false, false);
		SeaRobotHash ssr3 = new SeaRobotHash("Port", false, false);

		Map<Integer, SeaRobotHash> map3 = new Hashtable<Integer, SeaRobotHash>();
		//
		map3.put(1, ssr1);
		map3.put(2, ssr2);
		map3.put(3, ssr3);

		// Traversing Map
		for (Entry<Integer, SeaRobotHash> entry : map3.entrySet()) {
			Integer key = entry.getKey();
			SeaRobotHash r = entry.getValue();
			System.out.println(key + " Sea Robot Details: ");
			System.out.println(r.getParkingLocation() + ", " + r.getDeleted() + ", " + r.getUpgrade());
		}
		System.out.println(" ");

	}
}


