package team912.components;

import battlecode.common.Direction;
import battlecode.common.RobotController;

public class Utility {
	private RobotController control;
	
	public Utility(RobotController control) {
		this.control = control;
	}

	public Direction getRandomDirection(){
		int index = (int)(Math.random() * Direction.values().length);
		return Direction.values()[index];
	}
}
