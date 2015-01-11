package team912.units;

import team912.components.Communicator;
import team912.components.ComponentFactory;
import team912.components.Utility;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public abstract class Unit {

	// components are loaded lazily through getters
	private Communicator communicator;
	private Utility util;

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
	protected Utility getUtil(){
		if(util == null){
			util = ComponentFactory.getUtility(getControl());
		}
		return util;
	}
	
	protected MapLocation getLocation(){
		return getControl().getLocation();
	}
	
	protected RobotController getControl(){
		return control;
	}
	
	protected boolean isCoreReady(){
		return getControl().getCoreDelay() < 1;
	}

	public abstract void run() throws GameActionException;
}
