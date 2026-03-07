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
	void display()
	{
		System.out.println("price:"+this.price+",ringing:"+this.ringing+",brand:"+this.brand+",size:"+this.size+",electric:"+this.electric);
		if(this.hammer!=null)
		{
			this.hammer.getInfo();
		}
		if(this.metal!=null)
		{
			this.metal.getDetails();
		}
		if(this.rope!=null)
		{
			this.rope.showData();
		}
		if(this.sound!=null)
		{
			this.sound.printData();
		}
		if(this.stand!=null)
		{
			this.stand.info();
		}
	}
}