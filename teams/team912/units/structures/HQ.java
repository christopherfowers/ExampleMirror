package team912.units.structures;

import battlecode.common.GameActionException;
import battlecode.common.RobotController;
import battlecode.common.RobotType;

public class HQ extends Structure {

	public HQ(RobotController control) {
		super(control);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void _run() throws GameActionException {
		if (isCoreReady()) {
			// laziest, "just spawn something" possible
			getControl()
					.spawn(getUtil().getRandomDirection(), RobotType.BEAVER);
		}
	}

}
