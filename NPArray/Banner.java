class Banner
{
    String[] types;
    Image[] images;

    Banner(String[] types,Image[] images)
    {
        this.types=types;
        this.images=images;
    }

    void display()
    {
        System.out.println("Executing banner information......");

        if(this.types!=null)
        {
            System.out.println("Total banner type:"+this.types.length);

            for(String type:types)
            {
                System.out.println("Banner type:"+type);
            }
        }

        if(this.images!=null)
        {
            System.out.println("Total images:"+this.images.length);

            for(Image img:images)
            {
                img.getInfo();
            }
        }
    }
}