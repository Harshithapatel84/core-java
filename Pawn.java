class Pawn {

    String color;
    String position;
    boolean firstMove;
    boolean promoted;
    int moveCount;

    Pawn() {

    }

    Pawn(String color, String position, boolean firstMove, boolean promoted, int moveCount) {
        this.color = color;
        this.position = position;
        this.firstMove = firstMove;
        this.promoted = promoted;
        this.moveCount = moveCount;
    }

    Pawn(String color, String position) {
        this.color = color;
        this.position = position;
    }

    Pawn(boolean isFirstMove, boolean promoted, int moveCount) {
        this.firstMove = firstMove;
        this.promoted = promoted;
        this.moveCount = moveCount;
    }

    Pawn(String position) {
        this.position = position;
    }

    Pawn(boolean promoted, int moveCount) {
        this.promoted = promoted;
        this.moveCount = moveCount;
    }
}