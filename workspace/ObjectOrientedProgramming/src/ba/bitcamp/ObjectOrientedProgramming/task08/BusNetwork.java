package ba.bitcamp.ObjectOrientedProgramming.task08;

import ba.bitcamp.ObjectOrientedProgramming.task01.Computer;
import ba.bitcamp.ObjectOrientedProgramming.task02.Network;
import ba.bitcamp.ObjectOrientedProgramming.task06.Functionable;

public class BusNetwork extends Network implements Functionable{

	

	public BusNetwork(String networkName) {
		super(networkName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFunctioning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addComputer(Computer c) {
		
	}

	@Override
	public void removeComputer(Computer c) {
		// TODO Auto-generated method stub
		
	}

}
