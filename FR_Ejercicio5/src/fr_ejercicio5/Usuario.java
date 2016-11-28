/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_ejercicio5;

/**
 * Clase Usuario
 * @author Elena María Gómez Ríos y Jose Luis Martínez Ortíz
 */
public class Usuario {
    
    String user;
    String pass;

    /**
     * Constructor parametrizado
     * @param user Nombre del usuario
     * @param pass Contraseña del usuario
     */
    public Usuario(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    /**
     * Método que devuelve el nombre del usuario
     * @return nombre del usuario
     */
    public String getUser() {
        return user;
    }

    /**
     * Método que asigna el nombre del usuario
     * @param user nombre del usuario
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Método que devuelve la contraseña del usuario
     * @return contraseña del usuario
     */
    public String getPass() {
        return pass;
    }

    /**
     * Método que asigna la contraseña del usuario
     * @param pass contraseña del usuario
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
