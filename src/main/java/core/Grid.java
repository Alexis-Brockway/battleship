package core;

import static core.Ship.Direction.HORIZONTAL;
import static core.Ship.Direction.VERTICAL;

import java.util.List;

public class Grid {
    private final int rows;
    private final int cols;

    private Cell[][] grid;

    private List<Ship> shipList;
    private List<Cell> chosenCells;

    public Grid(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;

        grid = new Cell[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid[row][col] = new Cell();
            }
        }
    }

    public Cell get(Coord coordinate) {
        int row = coordinate.row - 1;
        int col = coordinate.col - 1;
        return grid[row][col];
    }

    public int numRows() {
        return rows;
    }

    public int numCols() {
        return cols;
    }

    public void defaultShipsFor5x5() {
        Ship ship1 = new Ship(1, 2, 3, VERTICAL, "Submarine");
        Ship ship2 = new Ship(5, 1, 5, HORIZONTAL, "Carrier");
        Ship ship3 = new Ship(1, 5, 3, VERTICAL, "Destroyer");
        shipList = List.of(ship1, ship2, ship3);
    }

    public static Grid defaultGrid() {
        Grid g = new Grid(5, 5);
        g.defaultShipsFor5x5();
        return g;
    }

    public boolean isValid(Coord coordinate) {
        int row = coordinate.row - 1;
        int col = coordinate.col - 1;
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
