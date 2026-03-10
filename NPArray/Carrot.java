class Carrot
{
    String color;
    int quantity;

    Carrot(String color,int quantity)
    {
        this.color=color;
        this.quantity=quantity;
    }

    void getInfo()
    {
        System.out.println("Carrot color:"+this.color);
        System.out.println("Carrot quantity:"+this.quantity);
    }
}