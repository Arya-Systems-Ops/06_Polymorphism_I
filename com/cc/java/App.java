package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        /* 1. Iteration - direkt */
        output(queen.doYourJob());
        output(queen.fly());
        output("-------------------");
        
        /* 2. Iteration - Überladung */
        // pollObj(queen);
        // pollObj(worker);
        // pollObj(drone);
        
        /* 3. Iteration - TRUE Polymorphismus */
        testPolymorphism(queen);
        testPolymorphism(worker);
        testPolymorphism(drone);
    }
    
    // Iteration 3: eine Methode für alle!
    private static void testPolymorphism(HoneyBee bee) {
        output(bee.doYourJob());
        output(bee.fly());
        output("-------------------");
    }
    
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
