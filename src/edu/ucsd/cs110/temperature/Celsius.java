package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
    public Celsius(float v) {
        super(v);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = (getValue() * 9) / 5 + 32;
        return new Fahrenheit(value);
    }

    @Override
    public String toString() {
        return this.getValue() + " C";
    }
}
