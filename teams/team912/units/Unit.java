package team912.units;

import team912.components.Communicator;
import team912.components.ComponentFactory;
import battlecode.common.RobotController;

public abstract class Unit {

	// components are loaded lazily through getters
	private Communicator communicator;

	private RobotController control;
	
	protected Unit(RobotController control){
		this.control = control;
	}

	protected Communicator getCommunicator() {
		if (communicator == null) {
			communicator = ComponentFactory.getCommunicator(getControl());
		}
		return communicator;
	}
	
	protected RobotController getControl(){
		return control;
	}

	public abstract void run();
}
