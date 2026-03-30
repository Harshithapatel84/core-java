class PresentationSlide extends Slide{
    String content;
    String author;
    double duration;
    boolean animated;
    String backgroundColor;

    PresentationSlide(){
        super();
        System.out.println("PresentationSlide object created");
    }

    void display(){
        System.out.println("Content:"+content+",Author:"+author+",Duration:"+duration+
        ",Animated:"+animated+",BackgroundColor:"+backgroundColor);
    }
}