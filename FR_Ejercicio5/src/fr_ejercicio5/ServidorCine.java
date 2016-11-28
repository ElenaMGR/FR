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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase ServidorCine
 * @author Elena María Gómez Ríos y Jose Luis Martínez Ortíz
 */
public class ServidorCine {
    
    // Usuarios y salas de nuestro cine
    static ArrayList<Usuario> usuarios = new ArrayList();
    static ArrayList<SalaCine> salas = new ArrayList();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loginSuccessful=false;
        
        InicializarCine();
        //Puerto al que conectarse
        int port = 8989;
        String textoRecibido="";
        // Abrimos el socket en modo pasivo, escuchando el en puerto indicado por "port"        
        ServerSocket socketServidor = null;
        try {
            socketServidor = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Error: no se pudo atender en el puerto " + port);
        }
        
        // Mientras ... siempre!
        Socket socketServicio = null;
        do {
            
            // Aceptamos una nueva conexión con accept()
            socketServicio = null;
            try {
                socketServicio = socketServidor.accept();
                System.out.println("Serv: recibo cliente"+socketServicio.getPort());
            } catch (IOException e) {
                System.out.println("Error: no se pudo aceptar la conexión solicitada");
            }
            
            
            try {
                BufferedReader inReader = new BufferedReader(new InputStreamReader(socketServicio.getInputStream()));
                textoRecibido = inReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ServidorCine.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(textoRecibido);
            if (!textoRecibido.equals("BYE")){
                if (ConsultarLogin(textoRecibido)){
                    textoRecibido = "OK";
                    loginSuccessful=true;
                }else {
                    textoRecibido = "ERROR";
                }

                PrintWriter outPrinter;
                try {
                    outPrinter = new PrintWriter(socketServicio.getOutputStream(),true);
                    outPrinter.println(textoRecibido);
                } catch (IOException ex) {
                    Logger.getLogger(ServidorCine.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (loginSuccessful){

                }
            }
            
        } while (true);
        
    }
    
    /** 
     * Inicializa el Cine con las salas y los usuarios.
     * 
     */
    private static void InicializarCine(){
        // Creación de los usuarios
        usuarios.add(new Usuario("Elena","elena"));
        usuarios.add(new Usuario("Jose","jose"));
        usuarios.add(new Usuario("Usuario1","usuario1"));
        usuarios.add(new Usuario("Usuario2","usuario2"));
        usuarios.add(new Usuario("Usuario3","usuario3"));
        
        //Creación de las salas
        salas.add(new SalaCine(1,"Aliados"));
        salas.add(new SalaCine(2,"Animales fantásticos"));
        salas.add(new SalaCine(3,"La llegada"));
        salas.add(new SalaCine(4,"Un monstruo viene a verme"));
        salas.add(new SalaCine(5,"Doctor Strange"));
    }
    
    /**
     * Método que comprueba que un usuario exista
     * @param usuario nombre de usuario
     * @param contraseña contraseña del usuario
     * @return true si el usuario existe, false en caso contrario
     */
    private static boolean ConsultarLogin(String login){
        boolean encontrado = false;
        String user = login.split("#")[0];
        String pass = login.split("#")[1];
        for (Usuario usuario : usuarios) {
            if(user.equals(usuario.getUser()) && pass.equals(usuario.getPass()))
                encontrado=true;
        }
        return encontrado;
    }
    
    private static void ProcesarLogin(){
        
    }
    
}
