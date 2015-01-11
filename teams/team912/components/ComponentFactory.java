package team912.components;

import battlecode.common.RobotController;

public class ComponentFactory {
	public static Mapper getMapper(RobotController control){
		return new Mapper(control);
	}
	public static Pather getPather(RobotController control){
		return new Pather(control);
	}
	public static Communicator getCommunicator(RobotController control){
		// TODO
		return null;
	}
	public static Utility getUtility(RobotController control){
		return new Utility(control);
	}
}
