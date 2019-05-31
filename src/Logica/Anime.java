/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Anime {
    
    private String subgeneros;
    private String estilo;
    private int episodios;

    public Anime(String subgeneros, String estilo, int episodios) {
        this.subgeneros = subgeneros;
        this.estilo = estilo;
        this.episodios = episodios;
    }

    public String getSubgeneros() {
        return subgeneros;
    }

    public String getEstilo() {
        return estilo;
    }

    public int getEpisodios() {
        return episodios;
    }
    
    
}
