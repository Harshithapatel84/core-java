package com.prg.Forest.mall;


import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class storeShopDetail {
    Shop[] shops;
    int curtIndex;
    storeShopDetail(Shop[] shops)
    {
     this.shops=shops;
    }

    void save(Shop shop)
    {
        System.out.println("executing to store the details");
        if(this.shops!=null && shops!=null)
        {
            int index=this.shops.length;
            if(curtIndex<=index)
            {
                this.shops[curtIndex]=shop;
                this.curtIndex++;
            }
        }
        else{
            System.out.println("no data to store");
        }
    }
    boolean searchByName(String location)
    {
        if(this.shops!=null && location!=null)
        {
            for(Shop shop:this.shops)
            {
                if(shop!=null)
                {
                    System.out.println("chech with shop name:"+shop.name);
                    if(shop.location == location) {
                        System.out.println("name:" + shop.name);
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
    boolean updateCounter(String name,int newCounter)
    {
        if(this.shops!=null && name!=null )
        {
            System.out.println("update counter by shop name");
            for(Shop shop:this.shops)
            {
                System.out.println("check with name:"+shop.name);
                if(shop!=null)
                {
                    if(shop.name==name)

                    {
                        shop.counter=newCounter;
                        System.out.println("counter:"+shop.counter);
                        return true;
                    }
                }
            }
        }
        else{}
        return false;
    }
}
