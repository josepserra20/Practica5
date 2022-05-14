package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class AppTest {

    @After
    public void main() {
        App test = new App();
        test.toString();
    }
    
    Calculadora tests = new Calculadora();
    
    @Test
    public void sumarTest() {
        
        assertEquals(0, tests.sumar(0, 0), 30);
        assertEquals(15, tests.sumar(10, 5), 30);
        assertEquals(-5, tests.sumar(-10, 5), 30);
    
    }
    @Test
    public void restarTest() {
        
        assertEquals(0, tests.restar(0, 0), 30);
        assertEquals(5, tests.restar(10, 5), 30);
        assertEquals(-15, tests.restar(-10, 5), 30);
    
    }
    @Test
    public void dividirTest() {
        
        assertEquals(0, tests.dividir(0, 0), 30);
        assertEquals(2, tests.dividir(10, 5), 30);
        assertEquals(-2, tests.dividir(-10, 5), 30);
        assertEquals(2.5, tests.dividir(20, 8), 30);
        
    
    }
    @Test
    public void multiplicarTest() {
        
        assertEquals(0, tests.multiplicar(0, 0), 30);
        assertEquals(50, tests.multiplicar(10, 5), 30);
        assertEquals(-50, tests.multiplicar(-10, 5), 30);
        assertEquals(-500, tests.multiplicar(-10, 5), 30);
    }
}
