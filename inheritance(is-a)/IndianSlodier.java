class IndianSlodier extends Soldier{
    String regiment;
    String weapon;
    int experience;
    boolean active;
    String location;

    IndianSlodier(){
        super();
        System.out.println("IndianSlodier object created");
    }

    void display(){
        System.out.println("Regiment:"+regiment+",Weapon:"+weapon+",Experience:"+experience+",Active:"+active+
        ",Location:"+location);
    }
}