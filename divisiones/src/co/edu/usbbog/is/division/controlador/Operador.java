/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.division.controlador;

import co.edu.usbbog.is.calculadora.Operacion;

/**
 * Clase para realizar operaciones de division
 *
 * @author Sebastian
 */
public class Operador {

    /**
     * Metodo para identificar que tipon de operacion se va a realizar
     *
     * @param o objeto que contiene las partes de una operacion
     * @return el objeto co su partes
     */
    public Operacion operar(Operacion o) {
        // Los casos posibles y no posibles
        if (o.getOpe() == 'w') {
            return null;
        } else {
            switch (o.getOpe()) {
                case '/':
                    o.setRes(division(o.getNum1(), o.getNum2()));
                    if (o.getRes() == 0) {
                        o.setInfo("Error Matematico");
                    } else {
                        o.setInfo("Operación exitosa");
                    }
                    break;
                case 'd':
                    o.setRes(divisionDecimal(o.getNum1(), o.getNum2()));
                    if (o.getRes() == 0) {
                        o.setInfo("Error Matematico");
                    } else {
                        o.setInfo("Operación exitosa");
                    }
                    break;
                case '%':
                    o.setRes(divisionModular(o.getNum1(), o.getNum2()));
                    if (o.getRes() == 0) {
                        o.setInfo("Error Matematico");
                    } else {
                        o.setInfo("Operación exitosa");
                    }
                    break;
                default:
                    System.out.println("operacion no valida");
                    return null;
            }
        }
        return o;
    }

    /**
     * Metodo privado para hacer una division normal, con ciertas
     * verificaciones, las cuales nos permiten identificar realizar el proceso
     * de division adecuadamente
     *
     * @param num1 primer numero puede ser dividendo o divisor
     * @param num2 egundo nuemro puede ser dividendo o divisor
     * @return el resultado es el cociente de la division
     */
    private double division(double num1, double num2) {
        if (num1 >= num2) {
            if (num2 == 0) {
                return 0;
            }
            return num1 / num2;
        } else {
            if (num1 == 0) {
                return 0;
            }
            return num2 / num1;
        }

    }

    /**
     * Metodo para realizar una division y que su resultado pueda ser decimal al
     * igual que el dividendo y divisor, se realizan las verificaciones
     * correspondientes para realizar la division decimal adecuadamente
     *
     * @param num1 primer numero es el dividendo
     * @param num2 segundo numero es el divisor
     * @return el resultado es el cociente de la division decimal
     */
    private double divisionDecimal(double num1, double num2) {
        if (num1 >= num2) {
            if (num2 == 0) {
                return 0;
            }
            return num1 / num2;
        }
        return num1 / num2;
    }

    /**
     * Metodo para realizar una division modular la cual nos dara el valor del
     * resudio de la division, se realizan las verificaciones correspondientes
     * para realizar la division modular adecuadamente
     *
     * @param num1
     * @param num2
     * @return
     */
    private double divisionModular(double num1, double num2) {
        if (num1 >= num2) {
            if (num2 == 0) {
                return 0;
            }
            return num1 % num2;
        } else {
            if (num1 == 0) {
                return 0;
            }
            return num2 % num1;
        }

    }

}
