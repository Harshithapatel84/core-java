class DoWhileDecrement
{
    public static void main(String[] args)
    {
        int i=5;
        double d=5.5;
        char ch='E';
        float f=5.0f;
        long l=15;

        do
        {
            int counter=1;
            while(counter<=1)
            {
                System.out.println("int: "+i);
                counter++;
            }
            i--;
        }
        while(i>0);

        do
        {
            int step=1;
            while(step<=1)
            {
                System.out.println("double: "+d);
                step++;
            }
            d--;
        }
        while(d>1.5);

        do
        {
            int repeat=1;
            while(repeat<=1)
            {
                System.out.println("char: "+ch);
                repeat++;
            }
            ch--;
        }
        while(ch>='A');

        do
        {
            int round=1;
            while(round<=1)
            {
                System.out.println("float: "+f);
                round++;
            }
            f--;
        }
        while(f>1.0f);

        do
        {
            int tick=1;
            while(tick<=1)
            {
                System.out.println("long: "+l);
                tick++;
            }
            l--;
        }
        while(l>10);
    }
}
