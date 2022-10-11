package org.example;

public class Calcolatrice {
    public static double somma(double operando1, double operando2){
        return operando1 + operando2;
    }

    public static double sottrazione(double operando1, double operando2){
        return operando1 - operando2;
    }

    public static double moltiplicazione(double operando1, double operando2){
        return operando1 * operando2;
    }

    public static double divisione(double operando1, double operando2){
        if(operando2 != 0){
            return operando1 / operando2;
        }
        return -1;
    }


}
