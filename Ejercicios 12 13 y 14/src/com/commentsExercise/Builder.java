package com.commentsExercise;

/**
 * Interfaz Builder, que define los métodos a ser implementados para la sublcase CarBuilder.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(Integer seats);
    void setEngine(Engine engine);
    void setWheels(Integer wheels);
    void setConvertible(Boolean convertible);
}
