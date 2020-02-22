package robots.impls.pool;

import robots.interfaces.Robot;
import robots.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

	private Collection<Robot> robotCollection;

	public T1000Pool(Collection<Robot> robotCollection) {
		super();
		this.robotCollection = robotCollection;
	}

	@Override
	public Collection<Robot> getRobotCollection() {
		return robotCollection;
	}

	public void beginShow() {
		for (Robot robot : robotCollection) {
			robot.action();
		}
	}

}
