class Image
{
    String format;
    int size;

    Image(String format,int size)
    {
        this.format=format;
        this.size=size;
    }

    void getInfo()
    {
        System.out.println("Image format:"+this.format);
        System.out.println("Image size:"+this.size);
    }
}