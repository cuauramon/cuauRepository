/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beeva.app.figuras;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



/**
 *
 * @author administradorcito
 */
@Component
public class Rectangulo implements iFigura{
    @Value("${figura.base}")
    private int base;
    @Value("${figura.altura}")
    private int altura;
    
    public Rectangulo(){
        
    }
    public void calcularArea() {
        System.out.println("El area del RECTANGULO es: "+(base*altura));
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
