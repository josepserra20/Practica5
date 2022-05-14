package com.example;

public class Calculadora implements ICalculadora {

    
    
    /** 
     * @param valor1
     * @param valor2
     * @return int
     */
    @Override
    public int sumar(int valor1, int valor2) {
        
        return valor1 + valor2;
    }

    
    /** 
     * @param valor1
     * @param valor2
     * @return int
     */
    @Override
    public int restar(int valor1, int valor2) {
        
        return valor1 - valor2;
    }

    
    /** 
     * @param valor1
     * @param valor2
     * @return int
     */
    @Override
    public int dividir(int valor1, int valor2) {
       if (valor2 == 0 ) {
           return 0;
       } else {
           return valor1 / valor2;
       }
    }

    
    /** 
     * @param valor1
     * @param valor2
     * @return int
     */
    @Override
    public int multiplicar(int valor1, int valor2) {
        
        return valor1 * valor2;
    }
    
}
