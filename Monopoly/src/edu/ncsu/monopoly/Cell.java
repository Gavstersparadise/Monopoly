package edu.ncsu.monopoly;

public abstract class Cell implements  IOwnable {
	private String name;
	protected Player theOwner;
	private boolean available = true;

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getTheOwner()
	 */
	@Override
	public Player getOwner() {
		return theOwner;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getPrice()
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#playAction(java.lang.String)
	 */
	
	@Override
	public abstract boolean playAction(String msg);

	void setName(String name) {
		this.name = name;
	}

	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setTheOwner(edu.ncsu.monopoly.Player)
	 */
	@Override
	public void setOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#isAvailable()
	 */
	
	@Override
	public boolean isAvailable() {
		return available;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setAvailable(boolean)
	 */
	
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
}