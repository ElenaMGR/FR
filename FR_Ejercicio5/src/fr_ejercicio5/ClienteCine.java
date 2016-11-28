/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elena María Gómez Ríos y Jose Luis Martínez Ortíz
 */
public class ClienteCine {

    String textoEnvio = "";
    String textoRecibido = "";

    Socket socketServicio = null;

    // Nombre del host donde se ejecuta el servidor:
    String host = "localhost";
    // Puerto en el que espera el servidor:
    int port = 8989;

    public void conectar() {
        // Socket para la conexión TCP

        // Creamos un socket que se conecte a "host" y "port":
        try {
            socketServicio = new Socket(host, port);
        } catch (UnknownHostException e) {
            System.err.println("Error: equipo desconocido");
        } catch (IOException e) {
            System.err.println("Error: no se pudo establecer laconexión");
        }

    }

    public void desconectar() {
        try {
            // Una vez terminado el servicio, cerramos el socket (automáticamente se cierran
            // el inpuStream  y el outputStream)
            socketServicio.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteCine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean login(String user, String pass) {
        PrintWriter outPrinter;
        textoEnvio = user+"#"+pass;
        try {
            outPrinter = new PrintWriter(socketServicio.getOutputStream(), true);
            outPrinter.println(textoEnvio);
            outPrinter.flush();
        } catch (IOException ex) {
            Logger.getLogger(ClienteCine.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedReader inReader;
        try {
            inReader = new BufferedReader(new InputStreamReader(socketServicio.getInputStream()));
            textoRecibido = inReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ClienteCine.class.getName()).log(Level.SEVERE, null, ex);
        }
        // MOstremos la cadena de caracteres recibidos:
        System.out.println("Recibido: ");
        System.out.println(textoRecibido);
        
        return textoRecibido.equals("OK");
    }

}
