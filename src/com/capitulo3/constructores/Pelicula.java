/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo3.constructores;

/**
 *
 * @author T
 */
public class Pelicula {
    private String titulo;
    private int duracion;

    
    public Pelicula(){
        titulo="No hay pelicula asignada";
    }
    
    public Pelicula(String titulo, int duracion){
        this.titulo=titulo;
        this.duracion=duracion;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitutlo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    void getDuracion(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
