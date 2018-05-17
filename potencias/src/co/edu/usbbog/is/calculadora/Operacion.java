/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.calculadora;

import java.io.Serializable;

/**
 *
 * @author 204
 */
public class Operacion implements Serializable {
    //Atributos
    /**
     * este numero representa el primer numero a operar
     */
    private double num1;
    /**
     * este numero representa el segundo numero a operar
     */
    private double num2;
    /**
     * este numero representa el resultado de la operacion
     */
    private double res;
    /**
     * representa la operacion a ejecutarse 
    */
    private char ope;
    //constructoras
    /**
     * constructora por defecto que limpia los atributos
     */
    public Operacion() {
        this.num1 = 0.0;
        this.num2 = 0.0;
        this.res = 0.0;
        this.ope = 'w';
    }
    /**
     * constructora que da los valores num1 y num2 y la operacion ope a realizar.
     * @param num1 representa el primer numero
     * @param num2 representa el segundo numero
     * @param ope representa la operacion
     */
    public Operacion(double num1, double num2, char ope) {
        this.num1 = num1;
        this.num2 = num2;
        this.res = 0.0;
        this.ope = ope;
    }
    
    /**
     * metodo para optener el primer numero
     * @return el valor del primer numero
     */
    public double getNum1() {
        return num1;
    }
    
    /**
     * cambiar el valor del primer numero
     * @param num1 el nuevo valor del primer numero
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public char getOpe() {
        return ope;
    }

    public void setOpe(char ope) {
        this.ope = ope;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", res=" + res + ", ope=" + ope + '}';
    }     

}
