package com.example.converter;

public class ConvertTemp {

    public ConvertTemp(){}

    public double celsiusToFahrenheit( double temp){
        return ((temp*9)/5)+32;
    }

    public double celsiusToKelvin( double temp){
        return temp+273.15;
    }

}