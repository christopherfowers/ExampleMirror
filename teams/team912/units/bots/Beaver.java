package team912.units.bots;

import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class Beaver extends Bot {

	public Beaver(RobotController control) {
		super(control);
	}

	@Override
	protected void _run() throws GameActionException {
		MapLocation target = getMapper().getEnemyHQLoc();
		move(getPather().pathTo(target));
	}

}
