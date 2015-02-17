package edu.ncsu.monopoly;

public class CardCell extends Cell {
    private int type;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    @Override
    public boolean playAction(String msg) {
    	return true;
    }
    
    public int getType() {
        return type;
    }

	

	
}