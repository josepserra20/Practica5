package com.example;

public class Calculadora implements ICalculadora {

    @Override
    public int sumar(int valor1, int valor2) {
        
        return valor1 + valor2;
    }

    @Override
    public int restar(int valor1, int valor2) {
        
        return valor1 - valor2;
    }

    @Override
    public int dividir(int valor1, int valor2) {
       
        return valor1 / valor2;
    }

    @Override
    public int multiplicar(int valor1, int valor2) {
        
        return valor1 * valor2;
    }
    
}
