package team912.components;

import battlecode.common.RobotController;

public class Component {

	private RobotController control;
	protected RobotController getControl(){
		return this.control;
	}
	
	public Component(RobotController control) {
		this.control = control;
	}

}
