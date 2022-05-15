# Práctica 5: Calculadora

Lapini Alessandro & Serra Josep

En esta prácticas vamos a realizar testing sobre un programa realizado en Java. 

Para empezar creamos la Interfaz del programa, así ya tendremos los métodos a sobreescribir.

```
package com.example;

interface ICalculadora {

    int sumar(int valor1, int valor2);
    int restar(int valor1, int valor2);
    int dividir(int valor1, int valor2);
    int multiplicar(int valor1, int valor2);
}

```

Una vez creada la interfaz ICalculadora creamos la clase Calculadora, que implementará los metodos de la interfaz.

```
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
```

Una vez creada la clase realizamos el primer commit a GitHub

![primer commit](/Practica5/images/commit.png)

Le añadimos tag al commit

![tag](/Practica5/images/tag.png)

Tras realizar el commit creamos los tests unitarios en JUnit. Al hacer click derecho en la clase nos dará la opción  de crear un test

Tras realizar el commit creamos los tests unitarios en JUnit. Al hacer click derecho en la clase nos dará la opción  de crear un test 

```
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
```

Una vez creados los tests realizamos un segundo commit para guardar el trabajo realizado.

![Segundo commit](/Practica5/images/gitlog.png)

Ahora comprobamos si el código pasa los tests.

![](/Practica5/images/testfallido.png)

Utilizamos **jacoco** para ver el porcentage de código que cubren nuestros tests.

![](/Practica5/images/jacoco.png)