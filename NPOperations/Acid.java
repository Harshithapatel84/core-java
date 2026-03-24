class Acid{
    String name;
    boolean strong;
    String state;
    String color;
    float pHvalue;

    Acid(String name,boolean strong,String state,String color,float pHvalue){
        this.name=name;
        this.strong=strong;
        this.state=state;
        this.color=color;
        this.pHvalue=pHvalue;
    }

    void printInfo(){
        System.out.println("acid information execution started..");
        System.out.println("name:"+this.name+",strong:"+this.strong+
        ",state:"+this.state+",color:"+this.color+
        ",pH:"+this.pHvalue);
    }
}