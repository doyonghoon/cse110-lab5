package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float v) {
        super(v);
    }

    @Override
    public Temperature toCelsius() {
        float value = (getValue() - 32) * 5 / 9;
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    @Override
    public String toString() {
        return this.getValue() + " F";
    }
}
