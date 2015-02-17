package edu.ncsu.monopoly;

public interface IOwnable {

	public abstract Player getTheOwner();
	public abstract String getName();
	public abstract int getPrice();
	
	public abstract void setTheOwner(Player owner);


	public abstract void setAvailable(boolean available);

	public abstract boolean playAction(String msg);
	

	public abstract boolean isAvailable();
	
	

}