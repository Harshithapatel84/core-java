class ChessGameBoard extends GameBoard{
    int square;
    String color;
    int player;
    boolean timer;
    String brand;

    ChessGameBoard(){
        super();
        System.out.println("executing the ChessGameBoard object ");
    }

    void display(){
        System.out.println("Squares:"+square+",ColorPattern:"+color+",Players:"+player+
        ",Timer:"+timer+",Brand:"+brand);
    }
}