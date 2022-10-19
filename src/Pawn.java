public class Pawn extends ChessPiece {

    boolean firstMove = true;

    public Pawn(String color) {
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

            System.out.println();
            if (getColor().equals("White")) {
                if (toColumn == column) {
                    System.out.println(toColumn + " " + column);
                    if (line == 1 && toLine == line + 2 && firstMove) {
                        firstMove = false;
                        return true;
                    }
                    if (toLine == line + 1) return true;
                }
            }
            if (getColor().equals("Black")) {
                if (toColumn == column) {
                    if (line == 6 && toLine == line - 2 && firstMove) {
                        firstMove = false;
                        return true;
                    }
                    if (toLine == line - 1) return true;

                }
            }

        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
