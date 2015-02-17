package edu.ncsu.monopoly;

public interface IOwnable {

	public abstract Player getTheOwner();
	
	
	public abstract void setTheOwner(Player owner);


	public abstract void setAvailable(boolean available);

	

	public abstract boolean isAvailable();
	
	

}