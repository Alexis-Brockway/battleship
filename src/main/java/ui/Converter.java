package ui;

import core.Cell;
import core.CellStatus;

/** interface to decide which visuals to uses */
public interface Converter {
    /**
     * @param cell is a location in the grid
     * @return the visual representation off that cell
     */
    String convert(Cell cell);

    String convert(CellStatus cellStatus);
}
