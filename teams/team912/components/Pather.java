package team912.components;

import battlecode.common.Direction;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class Pather extends Component {
	
	public Pather(RobotController control) {
		super(control);
	}

	public Direction pathTo(MapLocation target){
		return getControl().getLocation().directionTo(target);
	}

}
