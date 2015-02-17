package edu.ncsu.monopoly;

public interface IOwnable {

	public abstract String getName();

	public abstract Player getTheOwner();

	public abstract int getPrice();

	public abstract boolean playAction(String msg);

	public abstract void setTheOwner(Player owner);

	public abstract boolean isAvailable();

	public abstract void setAvailable(boolean available);

}