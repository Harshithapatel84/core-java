class Slide{
    String title;
    int number;
    String theme;

    Slide(){
        System.out.println("executing the Slide object");
    }

    void show(){
        System.out.println("Showing slide...");
    }

    void detail(){
        System.out.println("Title:"+title+",Number:"+number+",Theme:"+theme);
    }
}