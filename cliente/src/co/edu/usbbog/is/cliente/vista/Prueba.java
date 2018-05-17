/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.vista;

import co.edu.usbbog.is.calculadora.Operacion;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Clase que me realiza la operacion que el usuario escoga
 *
 * @author Sebastián
 */
public class Prueba {

    /**
     * Variable que me guarda el puerto que se va a utilizar como puente entre
     * servidor y cliente
     */
    public final static int PUERTO_POTENCIA = 9990;
    /**
     * Variable que me guarda la dirección ip que se va a utilizar como puente
     * entre servidor y cliente
     */
    public final static String HOST_POTENCIA = "127.0.0.1";

    /**
     * Metodo principal que envia un objeto al servidor que es una operacion
     *
     * @param args
     */
    public static void main(String[] args) {
        Operacion operacion = new Operacion(2.0, 3.0, '+', "");
        Socket clienteSocket = null;
        ObjectOutputStream oos = null;
        // Utilizamos un try and catch para manejar excepciones al utilizar sockets
        try {
            clienteSocket = new Socket(HOST_POTENCIA, PUERTO_POTENCIA);
            oos = new ObjectOutputStream(clienteSocket.getOutputStream());
            oos.writeObject(operacion);
            oos.flush();
            oos.close();
        } catch (IOException e) {

        }

    }
}
