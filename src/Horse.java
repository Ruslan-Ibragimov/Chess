public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(line) && chessBoard.checkPos(column)
                && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)
                && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].getColor().equals(this.color))) {
            if (toLine == line + 2 || toLine == line - 2) {
                if (toColumn == column + 1 || toColumn == column - 1)
                    return true;
            }
            if (toColumn == column + 2 || toColumn == column - 2) {
                if (toLine == line + 1 || toLine == line - 1)
                    return true;
            } else return false;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
