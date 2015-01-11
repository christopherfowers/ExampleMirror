package team912.units.structures;

import team912.units.Unit;
import battlecode.common.RobotController;


public abstract class Structure extends Unit {
	
	protected Structure(RobotController control) {
		super(control);
	}

	@Override
	public void run() {
		// method is a placeholder for any shared logic that becomes
		// necessary down the road
		_run();
	}

	protected abstract void _run();
}
