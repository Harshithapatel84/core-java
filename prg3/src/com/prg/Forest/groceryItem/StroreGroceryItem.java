package com.prg.Forest.groceryItem;

public class StroreGroceryItem {
    Grocery[] groceries;
    int curtIndex;

    public StroreGroceryItem(Grocery[] groceries) {
        this.groceries = groceries;
    }
    public void add(Grocery grocery)
    {
        System.out.println("executing to add the items");
        if(this.groceries!=null)
        {
            if(curtIndex<=this.groceries.length)
            {
                this.groceries[curtIndex]=grocery;
                this.curtIndex++;
            }
        }
        else{
            System.out.println("array is full");
        }
    }
     public boolean displayCost(String name)
    {
        if(this.groceries!=null)
        {
            for(Grocery grocery:this.groceries)
            {
                if(grocery!=null)
                {
                    if(grocery.name == name)
                    {
                        System.out.println("cost:"+grocery.cost);
                        return true;
                    }
                }
            }
        }
        else{}
        return false;

    }
    public boolean updateName(String type,String newName)
    {
        if(this.groceries!=null && type!=null)
        {
            for(Grocery grocery:this.groceries)
            {
                System.out.println("check with name:");
                if(grocery!=null)
                {
                    if(grocery.type == type)
                    {
                        grocery.name=newName;
                        System.out.println("name:"+grocery.name);
                        return true;
                    }
                }
            }
        }
        else{}
        return false;
    }
}
