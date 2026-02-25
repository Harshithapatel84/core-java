class CarromRunner {

    public static void main(String[] args) {

        Carrom carrom1 = new Carrom("Wood", 29.0, 19, true, "Synco");
        System.out.println("Carrom1 Material: " + carrom1.boardMaterial);
        System.out.println("Carrom1 Size: " + carrom1.boardSize);
        System.out.println("Carrom1 Coins: " + carrom1.numberOfCoin);
        System.out.println("Carrom1 Has Striker: " + carrom1.striker);
        System.out.println("Carrom1 Brand: " + carrom1.brand);


        Carrom carrom2 = new Carrom("Plywood", 26.0);
        System.out.println("Carrom2 Material: " + carrom2.boardMaterial);
        System.out.println("Carrom2 Size: " + carrom2.boardSize);
        System.out.println("Carrom2 Coins: " + carrom2.numberOfCoin);
        System.out.println("Carrom2 Has Striker: " + carrom2.striker);
        System.out.println("Carrom2 Brand: " + carrom2.brand);
    }
}