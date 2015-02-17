package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IOwnable;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(IOwnable cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
