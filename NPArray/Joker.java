class Joker
{
    String[] actions;
    Drama[] dramas;

    Joker(String[] actions,Drama[] dramas)
    {
        this.actions=actions;
        this.dramas=dramas;
    }

    void display()
    {
        System.out.println("Executing joker information......");

        if(this.actions!=null)
        {
            System.out.println("Total actions:"+this.actions.length);

            for(String action:this.actions)
            {
                System.out.println("Joker action:"+action);
            }
        }

        if(this.dramas!=null)
        {
            System.out.println("Total dramas:"+this.dramas.length);

            for(Drama drama:this.dramas)
            {
                drama.getInfo();
            }
        }
    }
}