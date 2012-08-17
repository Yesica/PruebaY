/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Usuario
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora prueba = new Calculadora();
        double add = prueba.add(3,2);
        double divide = prueba.divide(10,2);
        double multiply = prueba.multiply(10,10);
        double subtract = prueba.subtract(25,10);
        
        System.out.println(add);
        System.out.println(divide);
        System.out.println(multiply);
        System.out.println(subtract);
    }
    
}
