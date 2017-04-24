/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beeva.app.utils;

import com.beeva.app.figuras.iFigura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author administradorcito
 */
@Component
public class Calculadora {
    private int c;
    private String titulo;
    
    @Autowired
    @Qualifier("triangulo")
    private iFigura figura;
    
    
    
    public Calculadora(){
    }
    
    
    
    public void imprimirArea(){
        figura.calcularArea();
    }
    
    public void imprime(){
        figura.calcularArea();
    }
    
    public int suma(int a, int b){
        return a+b-c;
    }
    public int resta(int a, int b){
        return a-b+c;
    }
    
    public void salute(){
        System.out.println(">>>_____Saludos_____<<");
    }
    
    public void despetita(){
        System.out.println(">>>_____Adios_____<<");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
    public iFigura getFigura() {
        return figura;
    }

    public void setFigura(iFigura figura) {
        this.figura = figura;
    }
  
       
}
