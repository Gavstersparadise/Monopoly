package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player theOwner;
	protected boolean available = true;

	public String getName() {
		return name;
	}

	
	public Player getTheOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }
}