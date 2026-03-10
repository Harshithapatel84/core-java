class Scanner
{
    String[] areas;
    Bill[] bills;

    Scanner(String[] areas,Bill[] bills)
    {
        this.areas=areas;
        this.bills=bills;
    }

    void display()
    {
        System.out.println("Executing scanner information......");

        if(this.areas!=null)
        {
            System.out.println("Total areas:"+this.areas.length);

            for(String area:this.areas)
            {
                System.out.println("Scanner area:"+area);
            }
        }

        if(this.bills!=null)
        {
            System.out.println("Total hospitals:"+this.bills.length);

            for(Bill bill:this.bills)
            {
                bill.getInfo();
            }
        }
    }
}