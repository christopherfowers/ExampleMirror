package team912;

import team912.units.Unit;
import team912.units.UnitFactory;
import battlecode.common.RobotController;

public class RobotPlayer {
	public static void run(RobotController controller){
		Unit unit = UnitFactory.build(controller);
		while(true) {
			try {
				unit.run();
			} catch (Exception e) {
				e.printStackTrace();
			}
			controller.yield();
		}
	}
}
