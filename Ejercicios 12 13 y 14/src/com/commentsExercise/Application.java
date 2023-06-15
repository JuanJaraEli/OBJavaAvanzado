package com.commentsExercise;

public class Application {
    public static void main(String[] args) {
        Director director  = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.createLuxuryCar(carBuilder);

        Car car = carBuilder.getCar();
        System.out.println("My: " + car.getCarType() + " car.");
        System.out.println(car);
    }
}
