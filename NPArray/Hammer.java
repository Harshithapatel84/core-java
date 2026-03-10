class Hammer
{
    String[] varities;
    Work[] works;

    Hammer(String[] varities,Work[] works)
    {
        this.varities=varities;
        this.works=works;
    }

    void display()
    {
        System.out.println("Executing hammer information......");

        if(this.varities!=null)
        {
            System.out.println("Total varities:"+this.varities.length);

            for(String varity:this.varities)
            {
                System.out.println("Hammer varity:"+varity);
            }
        }

        if(this.works!=null)
        {
            System.out.println("Total works:"+this.works.length);

            for(Work work:this.works)
            {
                work.getInfo();
            }
        }
    }
}