/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class SalaCine {
    int numero;
    String pelicula;
    //True libre, False ocupada
    ArrayList<Boolean> butacas = new ArrayList();

    public SalaCine(int numero, String pelicula) {
        this.numero = numero;
        this.pelicula = pelicula;
        for(int i=0; i < 20; i ++){
            butacas.add(false);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Boolean> getButacas() {
        return butacas;
    }

    public void setButacas(ArrayList<Boolean> butacas) {
        this.butacas = butacas;
    }
    
    public Boolean getButaca(int n){
        return butacas.get(n);
    }
    
    public void setButaca(int i,Boolean estado){
        butacas.set(i, estado);
    }
    
    
}
