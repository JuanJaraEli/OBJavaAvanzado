package com.commentsExercise;

/**
 * Clase car: contiene todas las características que deben ser definidas para un nuevo vehículo.
 * Se incluyen los métodos getter y setter para cada variable.
 */
public class Car {

    private CarType carType;
    private Integer seats;
    private Engine engine;
    private Integer wheels;
    private Boolean convertible;

    public Car(CarType carType, Integer seats, Engine engine, Integer wheels, Boolean convertible) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.wheels = wheels;
        this.convertible = convertible;
    }

    public CarType getCarType() {
        return carType;
    }

    public Integer getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Integer getWheels() {
        return wheels;
    }

    public Boolean getConvertible() {
        return convertible;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return  "seats = " + seats + "\r\n" +
                engine + "\r\n" +
                "wheels = " + wheels + "\r\n" +
                "convertible = " + convertible;
    }
}
