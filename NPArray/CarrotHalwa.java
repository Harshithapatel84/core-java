class CarrotHalwa
{
    String[] carrotHalwa;
    Carrot[] carrots;

    CarrotHalwa(String[] carrotHalwa,Carrot[] carrots)
    {
        this.carrotHalwa=carrotHalwa;
        this.carrots=carrots;
    }

    void display()
    {
        System.out.println("Executing carrot halwa information...");

        if(this.carrotHalwa!=null)
        {
            System.out.println("Total items:"+this.carrotHalwa.length);

            for(String item:this.carrotHalwa)
            {
                System.out.println("Item:"+item);
            }
        }

        if(this.carrots!=null)
        {
            System.out.println("Total carrots:"+this.carrots.length);

            for(Carrot carrot:this.carrots)
            {
                carrot.getInfo();
            }
        }
    }
}