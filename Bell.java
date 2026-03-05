class Bell{

    double price;
    boolean ringing;
    String brand;
    int size;
    boolean electric;
	Hammer hammer;
    Metal metal;
    Rope rope;
    Sound sound;
    Stand stand;

    Bell(double price,boolean ringing,String brand,int size,boolean electric,
         Hammer hammer,Metal metal,Rope rope,Sound sound,Stand stand)
    {
        this.price=price;
        this.ringing=ringing;
        this.brand=brand;
        this.size=size;
        this.electric=electric;
		this.hammer=hammer;
        this.metal=metal;
        this.rope=rope;
        this.sound=sound;
        this.stand=stand;
    }
}