class MapDetail{
    Map[] maps;
    int curtIndex;

    MapDetail(Map[] maps){
        this.maps=maps;
    }

    void save(Map map){
        if(this.maps!=null){
            System.out.println("map details is not null execute..");
            if(map!=null){
                int index=this.maps.length-1;
                if(curtIndex<=index){
                    this.maps[curtIndex]=map;
                    this.curtIndex++;
                    map.printInfo();
                }
            }
            else{
                System.out.println("map is null");
            }
        }
        else{
            System.out.println("map details is null..");
        }
    }
}