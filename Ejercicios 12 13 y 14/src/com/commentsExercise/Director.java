package com.commentsExercise;

/**
 * La clase Director es la encargada de construir cada nuevo vehículo, dependiendo del tipo que sea. Para cada uno,
 * las características van variando.
 */
public class Director {
    public void createLuxuryCar(Builder builder){
        builder.setCarType(CarType.LUXURY);

        Engine engine = new Engine(3200);

        builder.setSeats(4);
        builder.setConvertible(Boolean.TRUE);
        builder.setEngine(engine);
        builder.setWheels(4);
    }

    public void createSportCar(Builder builder){
        builder.setCarType(CarType.SPORT);

        Engine engine = new Engine(4000);

        builder.setSeats(2);
        builder.setConvertible(Boolean.TRUE);
        builder.setEngine(engine);
        builder.setWheels(4);
    }

    public void createSmallCar(Builder builder){
        builder.setCarType(CarType.SMALL);

        Engine engine = new Engine(1200);

        builder.setSeats(2);
        builder.setConvertible(Boolean.FALSE);
        builder.setEngine(engine);
        builder.setWheels(4);
    }

}
