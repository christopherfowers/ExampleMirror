package team912.units.bots;

import team912.components.ComponentFactory;
import team912.components.Mapper;
import team912.components.Pather;
import team912.units.Unit;
import battlecode.common.RobotController;

public abstract class Bot extends Unit {
	
	// components are loaded lazily through getters
	private Mapper mapper;
	private Pather pather;

	public Bot(RobotController control){
		super(control);
	}
	
	@Override
	public void run() {
		// method is a placeholder for any shared logic that becomes
		// necessary down the road
		_run();
	}
	
	protected abstract void _run();

	protected Mapper getMapper() {
		if(mapper == null){
			mapper = ComponentFactory.getMapper(getControl());
		}
		return mapper;
	}

	protected Pather getPather() {
		if(pather == null){
			pather = ComponentFactory.getPather(getControl());
		}
		return pather;
	}
	
}
