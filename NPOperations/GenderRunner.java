class GenderRunner {
    public static void main(String[] args) {

        String[] gender={"Female","Male","Other"};
        GenderStore store=new GenderStore(gender);

        System.out.println("Ascending Order:");
        store.ascend();
        store.display();

        System.out.println("Descending Order:");
        store.descend();
        store.display();
    }
}