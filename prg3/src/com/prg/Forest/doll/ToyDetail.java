package com.prg.Forest.doll;

public class ToyDetail {

        Toy[] toys;
        int curtIndex;

        public ToyDetail(Toy[] toys)
        {
            this.toys=toys;
        }

        public void save(Toy toy)
        {
            System.out.println("executing to store the toy details");
            if(this.toys!=null && toys!=null)
            {
                int index=this.toys.length;
                if(curtIndex<=index)
                {
                    this.toys[curtIndex]=toy;
                    this.curtIndex++;
                }
            }
            else{
                System.out.println("no data to store");
            }
        }

        public boolean searchByName(String name)
        {
            if(this.toys!=null && name!=null)
            {
                for(Toy toy:this.toys)
                {
                    if(toy!=null)
                    {
                        System.out.println("check with toy name:"+toy.name);
                        if(toy.name==name)
                        {
                            System.out.println("name:"+toy.name);
                            return true;
                        }
                    }
                }
            }
            else
            {
                System.out.println("no name");
            }
            return false;
        }

        public boolean updatePrice(String name,double newPrice)
        {
            if(this.toys!=null && name!=null)
            {
                System.out.println("update price by toy name");
                for(Toy toy:this.toys)
                {
                    if(toy!=null)
                    {
                        System.out.println("check with name:"+toy.name);
                        if(toy.name==name)
                        {
                            toy.price=newPrice;
                            System.out.println("price:"+toy.price);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

