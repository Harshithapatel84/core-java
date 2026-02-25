class Carrom {

    String boardMaterial;
    double boardSize;
    int numberOfCoin;
    boolean striker;
    String brand;

    Carrom() {

    }

    Carrom(String boardMaterial, double boardSize, int numberOfCoin, boolean hasStriker, String brand) {
        this.boardMaterial = boardMaterial;
        this.boardSize = boardSize;
        this.numberOfCoin= numberOfCoin;
        this.striker = striker;
        this.brand = brand;
    }

    Carrom(String boardMaterial, double boardSize) {
        this.boardMaterial = boardMaterial;
        this.boardSize = boardSize;
    }

    Carrom(int numberOfCoin, boolean hasStriker) {
        this.numberOfCoin= numberOfCoin;
        this.striker = striker;
    }

    Carrom(String brand) {
        this.brand = brand;
    }

    Carrom(double boardSize) {
        this.boardSize = boardSize;
    }
}