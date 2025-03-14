package ui;

import core.Cell;
import core.CellStatus;

/** converts a cell state to a visual representation as a string */
public class DefualtConverter implements Converter {
    /**
     * @param cell is a location in the grid
     * @return a visulale respentaion of the cell for all computers
     */
    @Override
    public String convert(final Cell cell) {
        if (cell.cellIsHit()) {
            return "X";
        } else if (cell.hasShip()) {
            return "~";
        } else if (cell.cellIsMiss()) {
            return "*";
        } else if (cell.isEmpty()) {
            return "0";
        }
        return "";
    }

    @Override
    public String convert(final CellStatus cellStatus) {
        switch (cellStatus) {
            case ShipHit -> {
                return "X";
            }
            case ShipUnrevealed -> {
                return "~";
            }
            case Empty -> {
                return "*";
            }

            case Unknown -> {
                return "0";
            }
        }
        return "";
    }
}
