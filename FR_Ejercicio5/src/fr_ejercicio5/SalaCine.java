/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_ejercicio5;

import java.util.ArrayList;

/**
 * Clase SalaCine
 * @author Elena María Gómez Ríos y Jose Luis Martínez Ortíz
 */
public class SalaCine {
    // Número identificativo de la sala
    int numero;
    // Pelicula de la sala
    String pelicula;
    //Butacas que hay en la sala. True libre, False ocupada
    ArrayList<Boolean> butacas = new ArrayList();

    /**
     * Constructor parametrizado, por defecto todas las salas van a tener siempre 20 butacas
     * @param numero número identificativo de la sala
     * @param pelicula pelicula de la sala
     */
    public SalaCine(int numero, String pelicula) {
        this.numero = numero;
        this.pelicula = pelicula;
        for(int i=0; i < 20; i ++){
            butacas.add(false);
        }
    }

    /**
     * Método que devuelve el número identificativo de la sala
     * @return número identificativo de la sala
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que asigna el número identificativo de la sala
     * @param numero número identificativo de la sala
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que devuelve la pelicula de la sala
     * @return pelicula de la sala
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * Método que asigna la pelicula de la sala
     * @param pelicula pelicula de la sala
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Método que devuelve todas las butacas de la sala, siemdo true = libre y false = ocupada
     * @return butacas de la sala
     */
    public ArrayList<Boolean> getButacas() {
        return butacas;
    }

    /**
     * Método que asigna todas las butacas de la sala, siemdo true = libre y false = ocupada
     * @param butacas butacas de la sala
     */
    public void setButacas(ArrayList<Boolean> butacas) {
        this.butacas = butacas;
    }
    
    /**
     * Método que devuelve la butaca de la posición n
     * @param n posición en el array de la butaca a devolver
     * @return butaca en la posición n
     */
    public Boolean getButaca(int n){
        return butacas.get(n);
    }
    
    /**
     * Método que cambia al valor estado la butaca de la posición i
     * @param i posición en el array de la butaca a modificar
     * @param estado valor a asignar a la butaca de la posción i
     */
    public void setButaca(int i,Boolean estado){
        butacas.set(i, estado);
    }
    
    
}
