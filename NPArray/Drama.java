class Drama
{
    String title;
    int duration;

    Drama(String title,int duration)
    {
        this.title=title;
        this.duration=duration;
    }

    void getInfo()
    {
        System.out.println("Drama title:"+this.title);
        System.out.println("Drama duration:"+this.duration);
    }
}