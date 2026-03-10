class Work
{
    String type;
    boolean heavy;

    Work(String type,boolean heavy)
    {
        this.type=type;
        this.heavy=heavy;
    }

    void getInfo()
    {
        System.out.println("Work type:"+this.type);
        System.out.println("Heavy work:"+this.heavy);
    }
}