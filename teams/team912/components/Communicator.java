package team912.components;

import java.util.List;

import battlecode.common.GameActionException;
import battlecode.common.MapLocation;

public interface Communicator {
	/**
	 * Allocates a communication structure for a squad with the current bot as the lead
	 */
	void createSquad();
	
	/**
	 * 
	 * @return the ids of all squad members
	 * @throws GameActionException 
	 */
	List<Integer> getSquadMembers() throws GameActionException;
	
	/**
	 * adds the indicated bot to the current unit's squad
	 * 
	 * overrides any previous squad assignment
	 * @param unitId
	 */
	void addSquadMember(int unitId);
	
	/**
	 * 
	 * @param unitId
	 * @return the status for the specified unit
	 */
	UnitStatus getStatus(int unitId);
	
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
	 * @param unitId
	 * @param command
	 */
	void issueCommand(int unitId, Command command);
	
	/**
	 * 
	 * @return the most recent command issued for this robot
	 */
	Command getOrders();
}
