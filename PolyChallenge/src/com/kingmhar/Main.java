package com.kingmhar;

//class Car{
//    private String name;
//    private boolean engine;
//    private int cylinders;
//    private  int wheels;
//
//    public Car(String name, int cylinders) {
//        this.name = name;
//        this.cylinders = cylinders;
//        this.wheels = 4;
//        this.engine = true;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getCylinders() {
//        return cylinders;
//    }
//
//    public String startEngine()
//    {
//        return "Car -> startEngine";
//    }
//    public String accelarate()
//    {
//        return  "Car -> accelerate";
//    }
//    public String brake(){
//        return "car -> brake";
//    }
//}
//
//class Mitsubishi extends Car
//{
//    public Mitsubishi(String name, int cylinders) {
//        super(name, cylinders);
//
//    }
//
//    @Override
//    public String startEngine() {
//        return "mitsu -> startEngine";
//    }
//
//    @Override
//    public String accelarate() {
//        return  "mitsu -> accelerate";
//    }
//
//    @Override
//    public String brake() {
//        return "mitsu -> brake";
//    }
//}


public class Main {

    public static void main(String[] args) {
        // write your code here

//        Car car = new Car("Base car", 8);
//        System.out.println(car.startEngine());
//        System.out.println(car.accelarate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsu = new Mitsubishi("outlander",6);
//
//        System.out.println(mitsu.startEngine());
//        System.out.println(mitsu.accelarate());
//        System.out.println(mitsu.brake());
//
//        Ford ford = new Ford("Ford Falcon",6);
//
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelarate());
//        System.out.println(ford.brake());
//
//    }
//
//    static class Holden extends Car
//    {
//        public Holden(String name, int cylinders) {
//            super(name, cylinders);
//
//        }
//
//        @Override
//        public String startEngine() {
//            return "mitsu -> startEngine";
//        }
//
//        @Override
//        public String accelarate() {
//            return  "mitsu -> accelerate";
//        }
//
//        @Override
//        public String brake() {
//            return "mitsu -> brake";
//        }
//    }
//

        //quiz test

//        Burger b1 = new Burger("test", "beef");
//        b1.getTotalPrice();
//        b1.setNumberOfLettuce(2);
//        b1.setNumberOfCarrot(1);
//        b1.setNumberOfIstomato(1);
//        b1.getTotalPrice();

//        HealthyBurger hb1 = new HealthyBurger("chicken");
//        hb1.getTotalPrice();
//        hb1.setNumberOfIstomato(1);
//        hb1.setNumberOfLettuce(1);
//        hb1.getTotalPrice();
//        hb1.setNumberOfBrocolli(2);
//        hb1.getTotalPrice();

        TimBurger b2 = new TimBurger("Basic", "Sausage" , 3.56, "White");
            double price = b2.itemizeBurger();
        b2.addHamburgerAddtiona1("Tomato",0.27);
        b2.addHamburgerAddtiona2("Lettuce", 0.75);
        b2.addHamburgerAddtiona3("Cheese", 1.12);
        System.out.println("Total burger price: " + b2.itemizeBurger());



        TimHealthyBurger hb1 = new TimHealthyBurger("Bacon", 5.67);
        hb1.addHealthAdditona1("Egg",5.43);
        hb1.addHealthAdditona2("Lentils", 3.41);
        System.out.println("The total healthy burger price " + hb1.itemizeBurger());

        TimDeluxeBurger db = new TimDeluxeBurger();
        db.itemizeBurger();
        db.addHamburgerAddtiona1("2sdads",2);
    }


}
