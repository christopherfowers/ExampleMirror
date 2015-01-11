package team912.units;

import team912.units.bots.Basher;
import team912.units.bots.Beaver;
import team912.units.bots.Commander;
import team912.units.bots.Computer;
import team912.units.bots.Drone;
import team912.units.bots.Miner;
import team912.units.bots.Missile;
import team912.units.bots.Soldier;
import team912.units.bots.Tank;
import team912.units.structures.AerospaceLab;
import team912.units.structures.Barracks;
import team912.units.structures.HQ;
import team912.units.structures.HandwashStation;
import team912.units.structures.Helipad;
import team912.units.structures.Launcher;
import team912.units.structures.MinerFactory;
import team912.units.structures.SupplyDepot;
import team912.units.structures.TankFactory;
import team912.units.structures.TechnologyInstitute;
import team912.units.structures.Tower;
import team912.units.structures.TrainingField;
import battlecode.common.RobotController;

public class UnitFactory {
	
	public static Unit build(RobotController controller){
		switch(controller.getType()){
		case AEROSPACELAB:
			return new AerospaceLab(controller);
		case BARRACKS:
			return new Barracks(controller);
		case BASHER:
			return new Basher(controller);
		case BEAVER:
			return new Beaver(controller);
		case COMMANDER:
			return new Commander(controller);
		case COMPUTER:
			return new Computer(controller);
		case DRONE:
			return new Drone(controller);
		case HANDWASHSTATION:
			return new HandwashStation(controller);
		case HELIPAD:
			return new Helipad(controller);
		case HQ:
			return new HQ(controller);
		case LAUNCHER:
			return new Launcher(controller);
		case MINER:
			return new Miner(controller);
		case MINERFACTORY:
			return new MinerFactory(controller);
		case MISSILE:
			return new Missile(controller);
		case SOLDIER:
			return new Soldier(controller);
		case SUPPLYDEPOT:
			return new SupplyDepot(controller);
		case TANK:
			return new Tank(controller);
		case TANKFACTORY:
			return new TankFactory(controller);
		case TECHNOLOGYINSTITUTE:
			return new TechnologyInstitute(controller);
		case TOWER:
			return new Tower(controller);
		case TRAININGFIELD:
			return new TrainingField(controller);
		}
		// should never get here...
		return null;
	}
}
