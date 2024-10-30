package core;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    public enum Direction {
        HORIZONTAL,
        VERTICAL
    }

    private int startRow;
    private int startCol;
    private int size;
    private Direction direction;
    private String name;
    private List<Coord> CoordList;

    public Ship(int startRow, int startCol, int size, Direction direction, String name) {
        this.startRow = startRow;
        this.startCol = startCol;
        this.size = size;
        this.direction = direction;
        this.name = name;
        this.CoordList = getCoordList();
    }

    public int getSize() {
        return size;
    }

    public int getStartRow() {
        return startRow;
    }

    public int getStartCol() {
        return startCol;
    }

    public Direction getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }

    public boolean containsCoord(Coord coord) {
        for (Coord c : CoordList) {
            if (c.equals(coord)) {
                return true;
            }
        }
        return false;
    }

    public List<Coord> getCoordList(){
        List<Coord> CoordList = new ArrayList<Coord>();
        if (direction == Direction.HORIZONTAL) {
            for (int i = 0; i < this.size; i++) {
                CoordList.add(new Coord(startRow, startCol + i));
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                CoordList.add(new Coord(startRow + i, startCol));
            }
        }
        return CoordList;
    }

    /*
    public boolean isSunk() {
        for (Coord coord : CoordList) {
            if (!(Grid.get(coord).cellIsHit())) {
                return false;
            }
        }
        return true;
    }
    */

}
