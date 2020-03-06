/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class TempConversor {

    
    public double celsiusToKelvin (double temperature) {
        return temperature + 273;
    }
    
    public double celsiusToFahrenheit (double temperature) {
        return 9 * temperature / 5 + 32;
    }
    
    public double kelvinToCelsius (double temperature) {
        return temperature - 273;
    }
    
    public double kelvinToFahrenheit (double temperature) {
        return 9 * (temperature - 273) / 5 + 32; 
    }
    
    public double fahrenheitToCelsius (double temperature) {
        return 5 * (temperature - 32) / 9; 
    }

    public double fahrenheitToKelvin (double temperature) {
        return 5 * (temperature - 32) / 9 + 273;
    }
        
}
