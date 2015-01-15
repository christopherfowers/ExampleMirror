package team912.components;

import battlecode.common.MapLocation;

public interface Communicator {
	/**
	 * Allocates a communication structure for a squad with the current bot as the lead
	 */
	void createSquad();
	
	/**
	 * 
	 * @return the ids of all squad members
	 */
	int[] getSquadMembers();
	
	/**
	 * adds the indicated bot to the current unit's squad
	 * 
	 * overrides any previous squad assignment
	 * @param robotId
	 */
	void addSquadMember(int robotId);
	
	/**
	 * A method to set this unit's status
	 * @param status
	 */
	void setMyStatus(UnitStatus status);
	
	/**
	 * 
	 * @return location to move to
	 */
	MapLocation getMyMoveTarget();
	
	/**
	 * sets the target location for an individual robot
	 * @param robotId
	 * @param target
	 */
	void setMoveTarget(int robotId, MapLocation target);
	
	/**
	 * helper method
	 * effectively:
	 *     for each unit in getSquadMembers()
	 *         setMoveTarget(bot, target)
	 * @param target
	 */
	void setSquadMoveTarget(MapLocation target);
	
	/**
	 * issues a command to the selected robot
	 * @param robotId
	 * @param command
	 */
	void issueCommand(int robotId, Command command);
	
	/**
	 * 
	 * @return the most recent command issued for this robot
	 */
	Command getOrders();
}
