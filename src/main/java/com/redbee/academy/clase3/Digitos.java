package com.redbee.academy.clase3;


public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {
        Integer digitos = 0;

        if (numero == 0) {
            digitos++;
        } else {
            while (numero > 0) {
                numero = numero / 10;
                digitos++;
            }
        }
        return digitos;
    }
}
