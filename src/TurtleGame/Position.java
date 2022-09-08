package TurtleGame;

public class Position {
    private int row = 0;

    private int column = 0;
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object obj){
        if (!obj.getClass().equals(this.getClass())) return  false;
        Position comparedPosition = (Position) obj;
        boolean rowsAreEqual = comparedPosition.row == this.row;
        boolean columnsAreEqual  = comparedPosition.column == this.column;
        return  (rowsAreEqual && columnsAreEqual );
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int newColumn) {
        column = newColumn;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int newRow) {
        this.row = newRow;
    }
}
