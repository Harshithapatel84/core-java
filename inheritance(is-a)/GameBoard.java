class GameBoard{
    String name;
    int size;
    String material;

    GameBoard(){
        System.out.println("executing the GameBoard  ");
    }

    void start(){
        System.out.println("Game is starting...");
    }

    void detail(){
        System.out.println("Name:"+name+",Size:"+size+",Material:"+material);
    }
}