class StoreClothType{
    Cloth[] cloths;
    int curtIndex;

    StoreClothType(Cloth[] cloths){
        this.cloths=cloths;
    }

    void save(Cloth cloth){
        if(this.cloths!=null){
            System.out.println("cloth details is not null execute..");
            if(cloth!=null){
                int index=this.cloths.length-1;
                if(curtIndex<=index){
                    this.cloths[curtIndex]=cloth;
                    this.curtIndex++;
                    cloth.printInfo();
                }
                else{
                    System.out.println("array is full..");
                }
            }
            else{
                System.out.println("cloth is null");
            }
        }
        else{
            System.out.println("cloth details is null..");
        }
    }
}