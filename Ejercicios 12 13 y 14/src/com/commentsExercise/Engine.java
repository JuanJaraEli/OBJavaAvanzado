package com.commentsExercise;

/**
 * Clase engine: dependiendo del tipo de vehículo, su capacidad de motor es distinta, por tanto, es necesaria esta subclase.
 */

public class Engine {
    private Integer engineCapacity;

    public Engine(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "engineCapacity=" + engineCapacity;
    }
}
