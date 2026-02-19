class DoWhileIncrement
{
    public static void main(String[] args)
    {
        int i=1;
        double d = 1.5;
        char ch='A';
        float f=1.0f;
        long l=10;
		int age = 18; 
		double cost =9;  
		
        do
        {
            System.out.println("count: " + i);

            while(age <= 21)
            {
                System.out.println("Age is: " + age);
                age++;  
            }

            i++; 
        }
        while(i <= 3);
    

         do
        {
            System.out.println("d value: " + d);
            while(cost <= 10.05)
            {
                System.out.println("Cost is: " + cost);
                cost++;
            }

            d++;
        }
        while(d < 3);

        do
        {
            System.out.println("char: "+ch);
            ch++;
        }
        while(ch<='E');

        do
        {
            System.out.println("float: "+f);
            f++;
        }
        while(f<5.0f);
		
        do
        {
            System.out.println("long: "+l);
            l++;
        }
        while(l<15);
    }
}
