package com.dev.elevator;

public class move {

        double capacity;
        int step;
        String location;

        public move(double capacity, int step, String location) {
            this.capacity = capacity;
            this.step = step;
            this.location = location;
        }

        void printInfo() {
            System.out.println("executing to store the data");
            System.out.println("lift capacity:"+this.capacity);
            System.out.println("lift step:"+this.step);
            System.out.println("lift location:"+this.location);
        }

}
