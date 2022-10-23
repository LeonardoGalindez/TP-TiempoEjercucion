/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        multiplo();//cuenta cantidad de veces que se repite el bucle

    }

    public static void multiplo() {
        int n = 1;
        while (!(n == 10)) {
            n = n + 1;
        }
        System.out.println("Se iteraron: " + n + " veces ");
    }
}
