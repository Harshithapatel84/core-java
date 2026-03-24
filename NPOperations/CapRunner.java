class CapRunner{
    public static void main(String[] args){
     
        Cap[] caps=new Cap[10];
        StoreCapDetail store=new StoreCapDetail(caps);

        Cap cap1=new Cap("puma",200,"black","cotton",3);
        Cap cap2=new Cap("nike",500,"red","wool",2);
        Cap cap3=new Cap("adidas",300,"blue","polyester",4);
        Cap cap4=new Cap("reebok",450,"white","cotton",1);
        Cap cap5=new Cap("fila",290,"green","cotton",3);
        Cap cap6=new Cap("zara",650,"grey","cotton",2);
        Cap cap7=new Cap("hm",400,"yellow","cotton",4);
        Cap cap8=new Cap("gucci",900,"black","silk",1);
        Cap cap9=new Cap("lv",100,"brown","leather",2);
        Cap cap10=new Cap("armani",3200,"navy","wool",3);

        store.save(cap1);
        store.save(cap2);
        store.save(cap3);
        store.save(cap4);
        store.save(cap5);
        store.save(cap6);
        store.save(cap7);
        store.save(cap8);
        store.save(cap9);
        store.save(cap10);
    }
}
 