class Customer
{
    String name;
    double budget;

    Customer(String name,double budget)
    {
        this.name=name;
        this.budget=budget;
    }

    void getInfo()
    {
        System.out.println("Customer name:"+this.name);
        System.out.println("Customer budget:"+this.budget);
    }
}