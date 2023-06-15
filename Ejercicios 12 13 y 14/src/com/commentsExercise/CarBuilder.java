package com.commentsExercise;

/**
 * Clase CarBuilder: específica para la construcción de vehículos.
 * @implements Builder
 */

public class CarBuilder implements Builder{

    private CarType carType;
    private Integer seats;
    private Engine engine;
    private Integer wheels;
    private Boolean convertible;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    public Car getCar(){
        return new Car(carType, seats, engine, wheels, convertible);
    }
}
