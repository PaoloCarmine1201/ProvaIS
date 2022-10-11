package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double operando1 = 20;
        double operando2 = 5;

        System.out.println(Calcolatrice.somma(operando1, operando2));
        System.out.println(Calcolatrice.sottrazione(operando1, operando2));
        System.out.println(Calcolatrice.moltiplicazione(operando1, operando2));
        System.out.println(Calcolatrice.divisione(operando1, operando2));
    }
}
