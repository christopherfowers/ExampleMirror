package team912.components;

import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class Mapper extends Component {

	public Mapper(RobotController control){
		super(control);
	}
	
	public MapLocation getEnemyHQLoc(){
		return getControl().senseEnemyHQLocation();
	}

}
